package random_practice_problems;

import java.util.Arrays;

public class BuildArray {
    static void main() {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray2(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    static int[] buildArray2(int[] nums) {
        lets(nums, 0);
        return nums;
    }

    static void lets(int[] nums, int start){
        if (start < nums.length) {
            int res = nums[nums[start]];
            lets(nums, start+1);
            nums[start]=res;
        }
    }
}


