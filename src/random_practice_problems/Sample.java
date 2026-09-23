import random_practice_problems.Employee;

void main() {
    List<Employee> employees = Arrays.asList(
            new Employee("Prince", 28, "Software", 60000),
            new Employee("Charles", 32, "Finance", 90000),
            new Employee("Arun", 25, "Software", 50000),
            new Employee("Velayudam", 35, "HR", 75000),
            new Employee("David", 29, "Finance", 65000),
            new Employee("Ravi", 31, "Software", 85000)
    );

    //Filtering the employees whose salary is greater than 70000
    List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 70000).toList();
    employeeList.forEach(employee -> System.out.print(employee.getName()+" "));
    System.out.println();
    //extract list of emplyees names
    List<String> employeeNames = employees.stream().map(Employee::getName).toList();
    employeeNames.forEach(System.out::println);
    //Get names of employees age above 30
    List<String> empsAbove30 = employees.stream()
            .filter(employee -> employee.getAge() > 30)
            .map(Employee::getName)
            .toList();
    System.out.println(empsAbove30);
    //Get uppercase names of employees whose salary is greater than 60000
    List<String> empUpperCaseNames = employees.stream()
            .filter(e -> e.getSalary() > 60000)
            .map(Employee::getName)
            .map(String::toUpperCase)
            .toList();
    System.out.println(empUpperCaseNames);
    //Get square of ages of all employees
    List<Integer> squareOfEmpAges = employees.stream()
            .map(Employee::getAge)
            .map(age -> age * age)
            .toList();
    //Get length of employee names whose age is greater than 30
    List<Integer> lengthOfEmpsGreaterThan30 = employees.stream()
            .filter(e -> e.getAge() > 30)
            .map(Employee::getName)
            .map(String::length)
            .toList();
    System.out.println(lengthOfEmpsGreaterThan30);


    String s = "ABC123";



}
