package binary_search_practice;

public class FirstOccurrenceBS {
    static void main() {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        System.out.println(firstOccurrence(arr, 2));
    }

    static int firstOccurrence(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int answer = -1;//correction i should return -1 in case not answer found

        while(left <= right){//correction = should be added, because if we don't add it then index 0 may never get checked
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid -1;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return answer;
    }
}
