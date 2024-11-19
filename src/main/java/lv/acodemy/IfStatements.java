package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        // Even or Odd (if)

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }

        // Check if a number is positive or negative (Assume 0 is positive)

        number = -10;

        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        // Grade checker (if-else-if)
        // 90> = A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // < 50 = F

        // 1) Create score variable;
        // 2) Create logic if(score >= 90) -> A
        // else-if(score >= 75) -> B
        // else-if(score >= 50) -> C
        // else -> F

        int score = 68;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Task #1: Check if a person is eligible to buy an alcohol; (IF)

        int age = 15;
        if (age >= 18) {
            System.out.println("You can buy an alcohol");
        }

        // Task #2: Check if a number can be divided by 5;

        number = 10;
        if (number % 5 == 0) {
            System.out.println("Number can be divided by 5");
        }

        // Task #3: Check pass of fail
        // if score >= 50 (passed)
        // all other cases (failed)

        score = 30;
        if (score >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }

        // Temperature message (if-else-if)
        // Above 30 (It's hot)
        // Temperature between 15 and 30 (Nice weather)
        // Below 15 (Its cold)

        int temperature = 10;
        if (temperature > 30) {
            System.out.println("It is hot!");
        } else if (temperature >= 15) {
            System.out.println("The weather is nice!");
        } else {
            System.out.println("It is cold!");
        }

        // Traffic light system (if-else-if)
        // Green -> Go
        // Yellow -> Slow down
        // Red -> Stop
        // String color;
        // if(color.equals("Green")) { }

        String color = "green";

        if(color.equals("green")) {
            System.out.println("Go!");
        } else if (color.equals("yellow")) {
            System.out.println("Slow-down!");
        } else if (color.equals("red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Unknown color");
        }
    }
}
