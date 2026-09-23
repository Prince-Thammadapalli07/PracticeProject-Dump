package random_practice_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeArrays {
    static void main() {

        Map<String, String> map = new HashMap<>();
        map.put("A", "Prince");

        //Traversal problems practice.
        //Finding the max element from array
        //pattern: track best value based on condition
        int[] arr = {10, 23, 49, 56, 74, 90, 30, 30};
        int max = findMaxElement(arr);
//        System.out.println(max);

        //Count even numbers
        //initialize counter
        //increment when condition matches
        //pattern: count condition
        int count = countEvenNumbers(arr);
//        System.out.println(count);

        //check if element exists
        //if found return true
        //pattern: search
        int target = 74;
//        System.out.println(checkIfElementExists(arr, target));

        //sum of elements
        //pattern: accumulate

        int sum = sumOfElements(arr);
//        System.out.println(sum);

        /*
        * Find second highest value
        * Thinking: track two values highest, second highest
        * pattern: multi-tracking
        * */
//        System.out.println("Second Highest: "+secondHighest(arr));

        /*find min
        * Thinking: track minElement
        * pattern: track best min value
        * */
        int min = findMinElement(arr);
//        System.out.println(min);

        //Count numbers greater than 10
        //thinking: increment count based on condition
        //pattern: counting
        int countOfNumberGreaterThan0 = countNumbersGreaterThan0(arr);
//        System.out.println(countOfNumberGreaterThan0);

        /*Check if array is sorted
        * thinking: Traverse the array track curr element not greater  next index element
        * */
        boolean isSorted = checkIfArrayIsSorted(arr);
//        System.out.println(isSorted);

        /*Find Largest and Smallest together
        * thinking: track values based on condition on one loop
        * pattern: track the best value
        * */
//        findMaxAndMinElementTogether(arr);

        /*Count event and odd
        * pattern: counting
        * */
//        countEvenAndOdd(arr);

        /*Check is array has duplicates
        * pattern: flag
        * */
        boolean isDuplictedArray = checkIfArrayHasDuplicates(arr);
//        System.out.println(isDuplictedArray);

        /*Reverse Array
        pattern: Left & Right, Move inward
        * */
        int[] reverseArray = reverseArray(arr);
        System.out.println(Arrays.toString(reverseArray));

    }

    private static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    private static boolean checkIfArrayHasDuplicates(int[] arr) {
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[num] == arr[i]) {
                return true;
            } else {
                num++;
            }
        }
        return false;
    }

    private static void countEvenAndOdd(int[] arr) {
        int evenCounter = 0, oddCounter = 0;
        for (int num: arr){
            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("Even Numbers: "+evenCounter+" Odd Numbers: "+oddCounter);
    }

    private static void findMaxAndMinElementTogether(int[] arr) {
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for (int currNum : arr) {
            if (currNum > big) {
                big = currNum;
            }

            if (currNum < small) {
                small = currNum;
            }
        }

        System.out.println("Largest: "+big+" Smallest: "+small);
    }

    private static boolean checkIfArrayIsSorted(int[] arr) {
        int num = 0;
        boolean isSorted = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[num] < arr[i]){
                num++;
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        return isSorted;
    }


    private static int countNumbersGreaterThan0(int[] arr) {
        int count = 0;
        for (int num : arr){
            if (num > 10){
                count++;
            }
        }
        return count;
    }

    private static int findMinElement(int[] arr) {
        int minElement  = arr[0];
        for (int num: arr) {
            if (num < minElement) {
                minElement = num;
            }
        }
        return minElement;
    }


    private static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        return sum;
    }

    private static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int findMaxElement(int[] arr) {
        int maxElement =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    private static int secondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        return secondHighest;
    }

    private static boolean checkIfElementExists(int[] arr, int target) {
        for (int num: arr) {
            if (num == target)
                return true;
        }
        return false;
    }
}
