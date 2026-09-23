import random_practice_problems.Employee;

void main() {
    Employee prince = new Employee();
    prince.setId("1");
    prince.setName("Prince");
    prince.setAge(28);

    Employee charles = new Employee();
    charles.setId("2");
    charles.setName("Charles");
    charles.setAge(27);

    Employee chakri = new Employee();
    chakri.setId("3");
    chakri.setName("Chakri");
    chakri.setAge(29);
    List<Employee> employeeList = Arrays.asList(prince, charles, chakri);

    employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

    String name = "Java";
    Character ch = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
            Function.identity(),
            LinkedHashMap::new,
            Collectors.counting()
    )).entrySet().stream().filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst().get();
    System.out.println(ch);

    List<Integer> integerList = Arrays.asList(20,30,40,50,60,70, 70, 20, 40, 30);
    integerList.stream().distinct().sorted().forEach(System.out::print);
    System.out.println();
    System.out.println(integerList.stream().max(Comparator.comparing(Integer::intValue)).get());

    final String me = "prince";
    System.out.println(me.hashCode());
}
