package random_practice_problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewWithApex {
    static void main() {
        //merge two arrays into single array and sort them in reverse order
        int[] arr1 = {21, 45, 60, 85, 43};
        int[] arr2 = {33, 24, 56, 98, 40};
        List<Integer> mergedArray = mergeArrays(arr1, arr2);
        System.out.println(mergedArray);

        System.out.println(Stream.concat(
                        Arrays.stream(arr1).boxed(),
                        Arrays.stream(arr2).boxed())
                .sorted(Comparator.reverseOrder()).toList());

        String sentence = "This is a good day";



        String reversedSentece = Arrays.stream(sentence.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));

        System.out.println(reversedSentece);
    }

    private static List<Integer> mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> mergeList = new ArrayList<>();

        //merging
        for (int i : arr1) {
            mergeList.add(i);
        }

        for (int i : arr2){
            mergeList.add(i);
        }

        //sorting
        mergeList.sort(Collections.reverseOrder());

        return mergeList;
    }
}
