import javax.swing.text.html.parser.TagElement;
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

//        taskToDo(userInput());

//        System.out.println(days(2, 2040));

//        divideNumbers(423563);
//        int[] array = {2, 35, 2, 44, 664, 23, 10};
//        System.out.println("The summation of the arrya is : " + sumOfArray(array));
//        int[] arrayTwo = {20, 30, 70, 60};
//        System.out.println("The max nkmber of the array is : " + getMax(arrayTwo));
//    }
// int[] numbers={22,33,44,55,10,20,20,33,22};
//      int[]result=  getDistinctValues(numbers);
//        System.out.println(result);
//        System.out.println(numbers.length);
//        int[] distinct=new int[numbers.length];
//        int index=0;
//        for (int i = 0; i < numbers.length; i++) {
//            distinct[index]=numbers[i];
//            index++;
//        }
//        for (int i = 0; i < distinct.length; i++) {
//            System.out.println(distinct[i]);
//        }
        int[] numbers = {22, 33, 44, 55, 10, 20, 20, 33, 22};

        int[] result = getDistinctValues(numbers);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + "   ");
            }
        }

        System.out.println();
        int[] reverseArray = reverseArray(numbers);
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + "   ");

        }

        System.out.println();
        int targetElement = getTargetIndex(numbers, 55);
        System.out.println("Index of the target element is : "+targetElement);

        boolean found = isFound(numbers, 55);
        System.out.println(found);

    }


    /*
     * Making function to get the reverseArray
     * */

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i > 0; i--) {
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }


    /*
     * Making function to get the Target Index From the Array
     *
     * */
    public static int getTargetIndex(int[] array, int TargetNumber) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(TargetNumber == array[i]){
             index= i;
             break;
            }
        }

       return index;
    }

    /*
     * We will see if the element exists in the array or Not
     *
     * */
    public static boolean isFound(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }

    /*
     * We will make function to get the distinctValues From the array
     *
     * */
    public static int[] getDistinctValues(int[] array) {
        //This will require Two for loops uaAmer 
        int[] distinctNumbers = new int[array.length];
        int index = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct == true) {
                distinctNumbers[index] = array[i];
                index++;
            }
        }


        return distinctNumbers;
    }

    //--------------------------------------------------------

    /*
     * making function to return the biggest value of the array */
    public static int getMax(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
            }
        }
        return temp;
    }


    /*
     * making function to get the summation of the array */
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

/*
* Simple function of using while Loop ==>
* You have three part to look for initialization condition update Statement
* it's used when you don't know when the condition will over or End
* 89437824
8943782
894378
89437
8943
894
89
8
0
* */
    //872

    /*
     * This method used to print the reverse of the number
     * */
    public static void divideNumbers(int number) {
        int counter = 0;
        int temp;
        int sum = 0;
        while (number > 0) {
            temp = number % 10;
            System.out.print(temp);
            sum += temp;
            number = number / 10;
            counter++;
        }
        System.out.println("The number of division uaAmer is : ");
        System.out.println(counter);
        System.out.println("The sum of all numbers is : " + sum);
    }




    /*
     * we need to make function to git number of month
     * How to return the number of days in the month
     * */

    public static int days(int month, int year) {
        int daysCount = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysCount = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysCount = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    daysCount = 29;
                } else {
                    daysCount = 28;
                }
                break;
            default:
                daysCount = 0;
                break;
        }
        return daysCount;
    }

    /*
     * Just we need to make function to take input from use
     * */

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you number");
        int number = scanner.nextInt();
        return number;
    }


    /*
     * Write a program that asks the user to enter a number from 1 to 7,
     * representing the days of the week (1 for Monday, 2 for Tuesday, etc.).
     *  Use a ‘switch’ statement to print out a task to complete on that day of the week.
     * For example, if the user enters 1, the program might print “Go to the gym.”
     * */

    public static void taskToDo(int number) {
        switch (number) {
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