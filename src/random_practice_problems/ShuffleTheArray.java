package random_practice_problems;

import java.util.Arrays;

public class ShuffleTheArray {
    //1470. Shuffle the Array - https://leetcode.com/problems/shuffle-the-array/description/
    static void main() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffleTheArray(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffleTheArray(int[] nums, int n){
        int[] ans = new int[2 * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        return ans;
    }
}
