package random_practice_problems;

public class Main1 {
    static void main() {
        Student student = new Student();
        student.name = "Prince";
        student.age  = 20;

        final String name = "Charles";
        checkingAboutFinal(name);

        String s1 = "Prince";
        String s2 = new String("Prince");
        System.out.println(s1 == s2);
    }

    private static void checkingAboutFinal(String name) {
        name = "charles";
        System.out.println(name);
    }
}
