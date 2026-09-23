package random_practice_problems;

import java.util.Arrays;

public class ConcatenationArray {
    static void main() {
        int[] nums = {1,3,2,1};
        int[] arr = getConcatenation(nums);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int length = nums.length;
        for (int i = 0; i < nums.length * 2; i++) {
            if (i <= nums.length - 1) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - length];
            }
        }
        return ans;
    }
}
