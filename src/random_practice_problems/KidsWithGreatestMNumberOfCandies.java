package random_practice_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KidsWithGreatestMNumberOfCandies {
    //1431. Kids With the Greatest Number of Candies - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    static void main() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> list = kidsWithCandiesPractice1(candies, extraCandies);
        System.out.println(list);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();

        for (int candie: candies) {
            int currCandie = candie + extraCandies;
            boolean isGreatest = true;
            for (int candy: candies) {
                if (currCandie < candy && candy != candie) {
                    isGreatest = false;
                    break;
                }
            }

            if (isGreatest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    static List<Boolean> kidsWithCandies2(int[] candies, int extraCandie){
        List<Boolean> result = new ArrayList<>();

        int maxCandy = Integer.MIN_VALUE;
        for (int candy: candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandie >= maxCandy);
        }
        return result;
    }

    static List<Boolean> kidsWithCandiesPractice1(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();

        for (int candi: candies) {
            int extraCandieSum = candi + extraCandies;
            boolean isGreater = true;
            for (int c : candies) {
                if (extraCandieSum < c) {
                    isGreater = false;
                    break;
                }
            }

            if (isGreater) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
