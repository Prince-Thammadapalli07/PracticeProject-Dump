package binary_search_practice;

public class BsoaFindingBestPossibleMinimumIntegerSatisfiesCondition {
    static void main() {
        int[] arr = {4,5,6,7,8,9};
        int t = 25;
        int ans = findBinarySearchOnAnswerForMinimumPossibleInteger(arr, t);
        System.out.println(ans);
    }

    private static int findBinarySearchOnAnswerForMinimumPossibleInteger(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] * arr[mid] >= t) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
