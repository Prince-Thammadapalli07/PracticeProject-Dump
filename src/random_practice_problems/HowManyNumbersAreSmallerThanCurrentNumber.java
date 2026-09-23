package random_practice_problems;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    static void main() {
        int[] nums = {8,1,2,2,3};
        int[] ans = howManyNumbersAreSmaller2(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] howManyNumbersAreSmaller(int[] nums){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            for (int anotherNum : nums) {
                if (nums[i] > anotherNum) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    static int[] howManyNumbersAreSmaller2(int[] nums){
        int[] freq = new int[101];

        //count frequencies
        for (int num : nums) {
            freq[num]++;
        }

        //prefix sum
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = freq[nums[i] - 1];
            }
        }
        return ans;
    }
}
