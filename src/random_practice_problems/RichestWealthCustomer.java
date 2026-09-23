package random_practice_problems;

import java.util.Arrays;

public class RichestWealthCustomer {
    static void main() {
        int[][] accounts = {{1,5}, {7, 3}, {3,5}};
        int richestWealthSum = 0;
        for (int[] account : accounts) {
            int wealthSum = 0;
            for (int wealth: account) {
                wealthSum += wealth;
            }

            if (richestWealthSum < wealthSum) {
                richestWealthSum = wealthSum;
            }
        }
        System.out.println(richestWealthSum);
    }
}
