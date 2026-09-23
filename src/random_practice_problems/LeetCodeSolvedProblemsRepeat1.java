package random_practice_problems;

import java.util.*;

public class LeetCodeSolvedProblemsRepeat1 {
    static void main() {
        int[] nums = {8,1,2,2,3};
        int[] ans = getHowManyNumbersAreSmallerThanCurrentNumberOptimized(nums);
//        System.out.println(Arrays.toString(ans));

        int[] nums1 = {1,2,3,1,1,3};
        int countOfGoodPairs = getNumberOfGoodPairsOptimized(nums1);
        System.out.println(countOfGoodPairs);
    }

    //bruteForce approach
    static int getNumberOfGoodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    //optimizedApproach
    static int getNumberOfGoodPairsOptimized(int nums[]) {
        Map<Integer, Integer> freq = new HashMap<>();

        int count = 0;
        for (int num: nums) {
            count += freq.getOrDefault(num, 0);

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    //bruteforce approach
    static int[] getHowManyNumbersAreSmallerThanCurrentNumber(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }

            ans[i] = count;
        }
        return ans;
    }

    //optimized approach
    static int[] getHowManyNumbersAreSmallerThanCurrentNumberOptimized(int[] nums) {
        //freqArray
        int[] freq = new int[101];

        //count frequencies
        for (int num: nums) {
            freq[num]++;
        }

        //prefix sum
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i-1];
        }

        int[] ans = new int[nums.length];
        //resultant array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = freq[nums[i] - 1];
        }

        return ans;
    }
}
