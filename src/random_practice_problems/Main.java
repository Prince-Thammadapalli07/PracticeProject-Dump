//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //reversing a string using method1 for loop
    String name = "java";
    StringBuilder reverseString = new StringBuilder();
    for (int i = name.length() - 1; i >= 0; i--) {
        reverseString.append(String.valueOf(name.charAt(i)));
    }
    System.out.println(reverseString);

    //finding the largest number from the list
    List<Integer> intList = Arrays.asList(20, 30, 40, 50, 75, 35);
    int largestNumber = intList.stream().max(Integer::compareTo).get();
    System.out.println(largestNumber);

    //#using for loop
    int max = intList.getFirst();
    for (int i = 1; i < intList.size(); i++){
        int num = intList.get(i);
        if (num > max)
            max = num;
    }
    System.out.println(max);

    //swapping two numbers without using 3rd variable
    int a = 10, b = 20;
//    a = a + b;
//    b = a - b;
//    a = a - b;
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a + " "+ b);

    //printing fibonaci series
    int count = 10;
    printFibonacciSeries(count);
    System.out.println();
    //checking if string contains a vowel
    String vowelString = "Hello";
    stringContainsVowel(vowelString);
    //checking if the given number is prime number
    int primeNumOrNot = 20;
    System.out.println(checkIfNumberIsPrimeNumOrNot(primeNumOrNot));

    //printing a fibonacci series range using recursion
    for (int i = 0;i < 10; i++) {
        System.out.print(fibonacciRange(i)+", ");
    }
    System.out.println();
    //checking if list contains only odd numbers
    System.out.println(checkIsListContainsOnlyOddNum(Arrays.asList(21, 11, 13, 15, 17, 21, 19)));

    System.out.println("----");

}

private boolean checkIsListContainsOnlyOddNum(List<Integer> list) {
    for (Integer i: list) {
       if (i % 2 == 0)
           return false;
    }
    return true;
}

private int fibonacciRange(int i) {
    if (i <= 1)
        return i;

    return fibonacciRange(i - 1) + fibonacciRange(i - 2);
}

private boolean checkIfNumberIsPrimeNumOrNot(int num) {
    //if a number is only divisible by 1 and itself
    //check if number returns 0 from the range 2 to num/2
    //if is 0 then is not prime num else it is.
    if (num == 0  || num == 1) {
        return true;
    }
    for (int i = 2; i < num/2; i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

private void stringContainsVowel(String input) {
    System.out.println(input.toLowerCase().matches(".*[aeiou]*."));
}

private void printFibonacciSeries(int count) {
    int a = 0;
    int b = 1;
    int c = 1;

    for (int i = 1; i <= count; i++) {
        System.out.print(a+", ");

        a = b;
        b = c;
        c = a + b;
    }

}
