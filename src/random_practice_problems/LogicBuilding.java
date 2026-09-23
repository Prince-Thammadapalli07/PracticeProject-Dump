package random_practice_problems;

public class LogicBuilding {
    static void main() {
        //Find the missing number from the array
        int[] arr = {1,2,3,5,6,7};
        int max = arr[0];

        for(int num:arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(getTheMissingNumber(max, arr));

    }

    private static int getTheMissingNumber(int max, int[] arr) {
        for (int i = 1; i < max; i++) {
            boolean found = false;

            for(int num: arr){
                if(num == i){
                    found = true;
                    break;
                }
            }

            if(!found){
                return i;
            }
        }
        return -1;
    }
}
