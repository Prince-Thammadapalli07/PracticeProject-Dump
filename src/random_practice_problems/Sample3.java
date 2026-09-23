package random_practice_problems;

import java.util.*;

public class Sample3 {
    static void main() {
        int[] arr={1,2,3,2,4,5,4};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (int num: arr) {
            System.out.println(!seen.add(num));
            if (!seen.add(num))
                dup.add(num);
        }
        System.out.println(seen);
        System.out.println(dup  );


        int[] arr1 = {1, 3, 5, 13, 10, 12};

        TreeSet<Integer> set = new TreeSet<>();
        for (int num: arr1) {
            set.add(num);
        }

        System.out.println(set);
        int right = 0;
        int[] res = new int[arr1.length];


        List<Integer> list = Arrays.asList(10, 20, 40, 30, 60, 50, 90);
        Optional<Integer> secondHighestNumber = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighestNumber);
    }

}
