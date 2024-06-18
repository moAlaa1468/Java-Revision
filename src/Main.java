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

        System.out.println(comparison(90,323));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=scanner.nextInt();
        System.out.println(checkGrade(number));


    }




    public static int comparison(int first,int second){
        if(first>second){
            return first;
        }else
            return second;
    }

/*
// Task
Grading System: Create a grading system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
* Grading System: Create a grading
* system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
* */
public static String checkGrade(int grade){
    if(grade == 90){
        return "A";
    }else if (grade==80){
        return "B";
    }else if (grade == 70){
        return "C";
    }else if (grade == 60){
        return "D";
    }else {
        return "F";
    }
}
}