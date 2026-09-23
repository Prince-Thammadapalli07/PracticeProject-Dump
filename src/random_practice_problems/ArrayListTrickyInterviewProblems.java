package random_practice_problems;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTrickyInterviewProblems {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
//                System.out.println(list.get(i));
            }
        }

        List<Integer> failSafeArray = new CopyOnWriteArrayList<>();

        Set<Employee> customSet = new HashSet<>();
        customSet.add(new Employee("Prince", 28, "IT", 90));
        customSet.add(new Employee("Prince", 28, "IT", 90));
        System.out.println(customSet.size());
    }
}
