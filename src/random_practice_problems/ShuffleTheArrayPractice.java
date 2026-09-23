package random_practice_problems;

import java.util.Arrays;

public class ShuffleTheArrayPractice {
    static void main() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] res = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++, j +=2) {
                res[j] = nums[i];
                res[j+1] = nums[n+i];
        }

        System.out.println(Arrays.toString(res));
    }
}
