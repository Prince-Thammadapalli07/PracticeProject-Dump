package random_practice_problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeOne {
    static void main() {
        String s = "Hello World";

        //frequency of most repeating character
        Optional<Map.Entry<Character, Long>> freqOfChar = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                        .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                                .skip(1)
                                        .findFirst();
        System.out.println(freqOfChar);

        //Q1 - second-highest number
        //stream -> sort reverse -> skip 1 -> findFirst
        List<Integer> nums = Arrays.asList(10, 5, 20, 8, 15, 30);
        Optional<Integer> secondHighestNumber = nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestNumber);

        //Q2 names of employees sorted by salary descending
        //stream -> sort reverse by salary -> map -> toList
        List<Employee> employees = List.of(
                new Employee("Alice", 32, "IT", 70000),
                new Employee("Bob", 45, "Finance", 85000),
                new Employee("Charlie", 25, "IT", 60000),
                new Employee("David", 39, "HR", 90000),
                new Employee("Eve", 41, "IT", 70000 ),
                new Employee("Frank", 52, "Finance", 95000)
        );
        List<String> employeeNames = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();
        System.out.println(employeeNames);

        //Q3 find department with highest number of employees
        //stream - groupingBy dept - entrySet - stream - sorted by value reverse - map by key - find first
        Optional<String> departmentWithHighestNumOfEmployees = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey).findFirst();
        System.out.println(departmentWithHighestNumOfEmployees);

        //Q4 first non-repeating character
        //chars - mapToObj - groupingBy & count - filter by value equal to one - map by key - find first
        s = "swiss";
        Optional<Character> firstNonRepeatingCharacter = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, //improvement because this preserves insertion order
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(firstNonRepeatingCharacter);

        //Q5 highest salaried emp name
        //stream - sort by salary reverse - map by name - findFirst
        Optional<String> higestSalariedEmpName = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2) //third highest i did first highest
                .map(Employee::getName)
                .findFirst();
        System.out.println(higestSalariedEmpName);
    }
}
