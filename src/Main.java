import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Ctrl + D");
//        System.out.println("This will take a copy of the line down");
//        System.out.println("=======================");
//        System.out.println("Ctrl + Alt + Shift + up Arrow");
//        System.out.println("This will move the line up or down");
//        System.out.println("============================");
//        System.out.println("How to format Your code in intellij");
//        System.out.println("Ctrl + Alt + L ");
//        System.out.println("===========================");
//        System.out.println("Ctrl + Shift + /  ==> used to make multiple line comment");
//
//
//        System.out.println(comparison(90,323));
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your number");
//        int number=scanner.nextInt();
//        System.out.println(checkGrade(number));

//        System.out.println(sumOfTenNumbers());

        taskToDo(userInput());

    }

    /*
    * Just we need to make function to take input from use
    * */

    public static int userInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you number");
        int number= scanner.nextInt();
        return number;
    }


/*
* Write a program that asks the user to enter a number from 1 to 7,
* representing the days of the week (1 for Monday, 2 for Tuesday, etc.).
*  Use a ‘switch’ statement to print out a task to complete on that day of the week.
* For example, if the user enters 1, the program might print “Go to the gym.”
* */

    public static void taskToDo(int number){
        switch (number){
            case 1:
                System.out.println("Go to work ");
                break;
            case 2:
                System.out.println("Got to Club");
                break;
            case 3:
                System.out.println("Go to work ");
                break;
            case 4:
                System.out.println("Go to Home ");
                break;
            default:
                System.out.println("Go to Gym");
        }

    }


    /*
     * Sum of Numbers: Create a program that calculates the sum of all numbers from 1 to 100 using a ‘for’ loop
     * */
    public static int sumOfTenNumbers() {
        // You have to look for Three parts initialization condition and updateStatement
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static int comparison(int first, int second) {
        if (first > second) {
            return first;
        } else
            return second;
    }

    /*
    // Task
    Grading System: Create a grading system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
    * Grading System: Create a grading
    * system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
    * */
    public static String checkGrade(int grade) {
        if (grade == 90) {
            return "A";
        } else if (grade == 80) {
            return "B";
        } else if (grade == 70) {
            return "C";
        } else if (grade == 60) {
            return "D";
        } else {
            return "F";
        }
    }


}