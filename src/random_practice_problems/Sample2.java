package random_practice_problems;

public class Sample2 {
    static void main() {
        int num = 32;
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }
    }
}
