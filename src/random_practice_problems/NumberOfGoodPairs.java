package random_practice_problems;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    static void main() {
        int[] nums = {1,2,3,1,1,3};
        int count = numberOfGoodPairs1(nums);
        System.out.println(count);
    }

    static int numberOfGoodPairs1(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += freq.getOrDefault(num, 0);

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
        return count;
    }
}
