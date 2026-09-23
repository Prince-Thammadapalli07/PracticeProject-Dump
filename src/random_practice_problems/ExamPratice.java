package random_practice_problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExamPratice {
    static void main() {
        String s = "aabbcdd";

        List<Character> duplicateChars = s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        duplicateChars.forEach(System.out::print);
    }
}
