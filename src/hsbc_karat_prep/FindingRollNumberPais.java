package hsbc_karat_prep;

import java.util.*;

public class FindingRollNumberPais {
    static void main() {
        String[][] input = {
                {"A", "Math"},
                {"A", "Java"},
                {"A", "Sql"},
                {"B", "Java"},
                {"B", "Python"},
                {"C", "Python"},
                {"C", "AWS"}
        };

        //we are taking map with string and Set of string as output because
        //we wanna return the output in -> A,B -> [java, sql] manner
        Map<String, Set<String>> rollNoPairs = findRollNumberPairs(input);
        System.out.println(rollNoPairs);
    }

    private static Map<String, Set<String>> findRollNumberPairs(String[][] input) {
        //we loop the input array and form the roll number and course collection
        Map<String, Set<String>> rollNumNCourses = new HashMap<>();
        for (String[] arr: input) {
            String rollNumber = arr[0];
            String course = arr[1];
            //we gonna use computeIfAbsent from the map to add the course if roll number already
            // exists else we create new empty set
            rollNumNCourses.computeIfAbsent(rollNumber, k -> new HashSet<>())
                    .add(course);
        }

        //Now we iterate through the keyset and generate the unique pair and also intersect their courses
        //first convert the set of roll numbers to the list
        List<String> rollNumbers = new ArrayList<>(rollNumNCourses.keySet());
        Map<String, Set<String>> pairs = new HashMap<>();
        for (int i = 0; i < rollNumbers.size(); i++) {
            //we take rollNumber and courseName
            String rollA = rollNumbers.get(i);
            Set<String> courseA = rollNumNCourses.get(rollA);

            //we start inner loop to form the pair with above rollNumber
            for (int j = i+1; j < rollNumbers.size(); j++) {
                String rollB = rollNumbers.get(j);
                Set<String> courseB = rollNumNCourses.get(rollB);

                //we create fresh commonCourses set for intersecting the pair
                Set<String> commonCourses = new HashSet<>();

                for (String course: courseA) {
                    if (courseB.contains(course)) {
                        commonCourses.add(course);
                    }
                }

                pairs.put(rollA+","+rollB, commonCourses);
            }
        }
        return pairs;
    }
}
