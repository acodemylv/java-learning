package lv.acodemy;

public class Example {
    public static void main(String[] args) {
        sayHello();
        greet("Nikita");
        greet("John");
        greet("Alen");
        greet("Alex");

        System.out.println(add(30, 60));
        int x = add(30, 90);
        System.out.println(x);

        System.out.println(add(12.2, 13.5));

        double a = 12.12;
        double b = 13.5;
        System.out.println(add(a, b));

        var firstStudent = calculateGrade(70);
        System.out.println(firstStudent);

        var secondStudent = calculateGrade(90);
        System.out.println(secondStudent);
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method overloading

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
