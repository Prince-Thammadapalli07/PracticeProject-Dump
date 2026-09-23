package binary_search_practice;

public class RotatedBinarySearch {
    static void main() {
        int[] arr = {2,3,4,5,1};
        int target = 3;
        System.out.println(findingIndexInRotatedBinarySearch(arr, target));
    }

    static int findingIndexInRotatedBinarySearch(int[] arr, int target){
        int pivot = findPivot(arr);
        int start = 0;
        if (pivot == -1){
            return binarySearch(arr, target, start, arr.length-1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }

        if (arr[start] <= target) {
            return binarySearch(arr, target, start, pivot-1);
        }

        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        int left = start;
        int right = end;


        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid-1;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;

            //case1
            if (mid < end && arr[mid] > arr[mid+1]) { //correction mid always should be less than end
                return mid;
            }
            //case2
            if (mid > start && arr[mid] < arr[mid-1]) { //correction mid always should be greater than start
                return mid-1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
