package random_practice_problems;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    static void main() {
        List<Employee> employees = List.of(
                new Employee("Alice", 32, "IT", 70000),
                new Employee("Bob", 45, "Finance", 85000),
                new Employee("Charlie", 25, "IT", 60000),
                new Employee("David", 39, "HR", 90000),
                new Employee("Eve", 41, "IT", 70000 ),
                new Employee("Frank", 52, "Finance", 95000)
        );

        Map<String, Employee> employeeMap = employees.stream().collect(Collectors.toMap(
                Employee::getDept,
                Function.identity(),
                BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
        //using collect
        Map<String, Employee> employeeMap1 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get
                )
        ));

        //returning dept and List of employees
        Map<String, List<Employee>> employeesMap = employees.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            int maxSalary = list.stream().mapToInt(Employee::getSalary).max().orElse(0);
                            return list.stream().filter(employee -> employee.getSalary() == maxSalary).toList();
                        }
                )
        ));

        String word = "PrinceCharles";
        Map<Character, Long> freqOfEachChar = word.chars().mapToObj(ch -> (char) ch).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        );

        System.out.println(freqOfEachChar);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        //palindrome program
        boolean isPalindrome = IntStream.range(0, word.length()/2).noneMatch(i -> word.charAt(i) != word.charAt(word.length() - i - 1));
        System.out.println(isPalindrome);

        //last element of an array
        long lastElementInAnArray = integerList.stream().skip(integerList.size() - 1).findFirst().orElse(0);
        System.out.println(lastElementInAnArray);

        int[] arr = {10, 20, 25, 30, 35, 70, 60};
        System.out.println(getSecondGreatestElement(arr));
    }

    private static int getSecondGreatestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
