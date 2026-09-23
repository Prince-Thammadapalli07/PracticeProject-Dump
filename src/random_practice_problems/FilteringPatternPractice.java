package random_practice_problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilteringPatternPractice {
    static void main() {
        //filtering
        //Get names of employees whose salary is greater than 60k
//        List<random_practice_problems.Employee> employeeList = Arrays.asList(
//                new random_practice_problems.Employee("Prince", 28, "Software", 60000),
//                new random_practice_problems.Employee("Mitchelle", 28, "Software", 80000),
//                new random_practice_problems.Employee("Charles", 29, "Operations", 70000),
//                new random_practice_problems.Employee("Chance", 29, "Operations", 90000),
//                new random_practice_problems.Employee("Chakravarthi", 30, "HR", 80000),
//                new random_practice_problems.Employee("Alice", 30, "HR", 100000),
//                new random_practice_problems.Employee("Velayudam", 31, "Finance", 90000),
//                new random_practice_problems.Employee("Stallon", 31, "Finance", 120000)
//        );
//
//        //version i did
//        List<random_practice_problems.Employee> employees = employeeList.stream().filter(employee -> employee.getSalary() > 60000).toList();
//        employees.forEach(employee -> System.out.println(employee.getName()));
//
//        //version improvised
//        List<String> names  = employeeList.stream().filter(employee -> employee.getSalary() > 60000).map(random_practice_problems.Employee::getName).toList();
//        System.out.println(names);
//
//        //now after filtering sort the employees descending based on salary and return the names
//        List<String> sortedEmps = employeeList.stream().filter(employee -> employee.getSalary() > 60000)
//                .sorted(Comparator.comparing(random_practice_problems.Employee::getSalary).reversed())
//                .map(random_practice_problems.Employee::getName)
//                .toList();
//        System.out.println(sortedEmps);
//
//        //now sort descending, and find second highest employee name from the list
//        String secondHighestSalariedEmp = employeeList.stream()
//                .sorted(Comparator.comparing(random_practice_problems.Employee::getSalary).reversed())
//                .skip(1)
//                .map(random_practice_problems.Employee::getName)
//                .findFirst()
//                .orElse("");
//        System.out.println(secondHighestSalariedEmp);
//
//        //counting the number of employees per department
//        Map<String, Long> numberOfEmpsPerDept = employeeList.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getDept,
//                Collectors.counting()
//        ));
//        System.out.println(numberOfEmpsPerDept);
//
//        Map<String, Optional<random_practice_problems.Employee>> highestPaidEmpPerDept = employeeList.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getDept,
//                Collectors.maxBy(Comparator.comparing(random_practice_problems.Employee::getSalary))
//        ));
//        highestPaidEmpPerDept.forEach((e , emp) -> {
//            System.out.print("["+e+"-"+emp.get().getName()+" "+emp.get().getSalary()+"] ");
//        });
//
//        //return department that has highiest salary paidout
////        Optional<String> highestPaidOutDept = employeeList.stream().collect(Collectors.groupingBy(
////                random_practice_problems.Employee::getDept,
////                Collectors.summingInt(random_practice_problems.Employee::getSalary)
////        )).entrySet().stream().map(Map.Entry::getValue)
////                .max(Integer::compareTo)
////                .map(Map.Entry::getKey)
////                .get()
//        //above is my mistake below is correction
//        Optional<String> highestPaidOutDept = employeeList.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getDept,
//                Collectors.summingInt(random_practice_problems.Employee::getSalary)
//        )).entrySet()
//                .stream().max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey);
//        System.out.println(highestPaidOutDept.get());
//
//        //Department whose average of salaries is highest
//        Optional<String> highestSalariedAvgDept = employeeList.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getDept,
//                Collectors.averagingInt(random_practice_problems.Employee::getSalary)
//        )).entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey);
//        System.out.println(highestSalariedAvgDept.get());
//
//        //find duplicate employees
//        List<random_practice_problems.Employee> employees1 = Arrays.asList(
//                new random_practice_problems.Employee("Prince", 28, "Software", 60000),
//                new random_practice_problems.Employee("Charles", 29, "Software", 70000),
//                new random_practice_problems.Employee("Prince", 30, "Finance", 80000),
//                new random_practice_problems.Employee("Velayudam", 31, "HR", 90000),
//                new random_practice_problems.Employee("Charles", 32, "Finance", 75000),
//                new random_practice_problems.Employee("Arun", 27, "HR", 50000)
//        );
//
//        List<String> duplicateEmps = employees1.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getName,
//                Collectors.counting()
//        )).entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey).toList();
//        //second highest paid employee in each department
//        Map<String, Optional<random_practice_problems.Employee>> highestPaidEmpInEachDept = employees1.stream().collect(Collectors.groupingBy(
//                random_practice_problems.Employee::getDept,
//                Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list ->
//                            list.stream()
//                                    .sorted(Comparator.comparing(random_practice_problems.Employee::getSalary).reversed())
//                                    .skip(1)
//                                    .findFirst()
//
//                )
//        ));

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");


        Optional<String> name = listOfStrings.stream().collect(Collectors.groupingBy(

                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()

                )).keySet()
                .stream()
                .findFirst();

        System.out.println(name);

    }
}
