package random_practice_problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringProblemPractice {
    static void main() {
        String s = "aabbbccddddcc";

        List<String> list = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count <= 2) {
                    list.add(s.charAt(i - 1)+"="+count);
                }
                count = 1;
            }
        }
        if(count <= 2){
            list.add(s.charAt(s.length() - 1)+"="+count);
        }
        System.out.println(list);
    }
}
