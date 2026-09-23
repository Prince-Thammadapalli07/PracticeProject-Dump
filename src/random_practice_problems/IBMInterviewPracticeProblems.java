package random_practice_problems;

import java.util.*;

public class IBMInterviewPracticeProblems {
    static void main() {
        String s = "aabccddef";
        for (int i = 0; i < s.length(); i++) {

            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(s.charAt(i));
                break;
            }
        }

        //optimize method
        Map<Character, Integer> map = new LinkedHashMap<>();

        List<Integer> lit = new ArrayList<>();


        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch: s.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

        System.out.println("Two Sum");
        //two sum
        int[] arr = {2, 7, 11, 15, 2};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(Arrays.toString(new int[]{arr[i], arr[j]}));
                    break;
                }
            }
        }
        //optimized version
        System.out.println("two sum optimized version");
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map1.containsKey(complement)) {
                System.out.println(Arrays.toString(new int[]{map1.get(complement), i}));
                break;
            }
            map1.put(arr[i], i);
        }

        System.out.println("Finding duplicates");
        //find duplicates
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        //optimized approach
        Set<Integer> set = new HashSet<>();
        for (int num: arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate element "+num);
                break;
            }
            set.add(num);
        }

        //palindrome
        System.out.println("Palindrome");
        String s1 = "madam";
        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right))  {
                System.out.println("Not palindrome");
                break;
            }
            left++;
            right--;
        }

        //anagrams
        System.out.println("Anagrams");
        String string1 = "listen";
        String string2 = "silent";

        char[] chArr1 = string1.toCharArray();
        char[] chArr2 = string2.toCharArray();

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        System.out.println("Are they anagrams? :"+ Arrays.equals(chArr1, chArr2));
    }
}
