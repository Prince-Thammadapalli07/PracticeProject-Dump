package binary_search_practice;

public class BinarySearchOnAnswerFindingMaximumPossibleIntegerSatisfiesCondition {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int x = 20;
        int ans = findBinarySearchOnAnswerForMaximumPossibleInteger(arr, x);
        System.out.println(ans);
    }

    private static int findBinarySearchOnAnswerForMaximumPossibleInteger(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] * arr[mid] <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
