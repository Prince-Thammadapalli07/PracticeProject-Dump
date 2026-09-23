package binary_search_practice;

public class BinarySearchPractice1 {
    static void main() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = findTheElementFromTheArray(arr, target);
        System.out.println(result);
    }

    private static int findTheElementFromTheArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;


        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid-1;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
