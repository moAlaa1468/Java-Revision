package amer.alaa.mohamed.package2;

import java.util.Scanner;

 public class ArrayEngine {

    /*
     * This is another solution for adding zero to the array if exists
     *- There are a lot of solutions to solve this task uaAlaa You need to f
     * */
    public  int[] distinctTwo(int[] array) {
        int[] result = new int[array.length];
        int amerIndex = 0;
        boolean flag=true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && flag == true) { //This is the point of the code uaAlaa
                result[amerIndex] = array[i];
                amerIndex++;
                flag = false;
            }
            if (!isFound(result, array[i])) {

                {
                    result[amerIndex] = array[i];
                    amerIndex++;

                }
            }
        }
        return sliceArray(result, amerIndex);
    }

    /*
     * This method is used to get the distinct Values
     *                                       //0,1,2,3,4,5     0 1 2
     * */                                   //4,0,30,0,10,0    4 0 30
    public  int[] distinct(int[] numbers) {
        int[] result = new int[numbers.length];
        int amerIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            int outIndex = getTargetIndex(result, numbers[i]);
            if (outIndex == -1 || outIndex == i) {
                result[amerIndex] = numbers[i];
                amerIndex++;
            }
        }
        return sliceArray(result, amerIndex);
    }

    /*
     * we need to make function to sliceArray
     * */

    public  int[] sliceArray(int[] array, int size) {
        int[] trimmedArray = new int[size];
        for (int i = 0; i < size; i++) {
            trimmedArray[i] = array[i];
        }
        return trimmedArray;
    }


    /*
     * Making function to get the reverseArray
     * */

    public  int[] reverseArray(int[] array) {
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
    public  int getTargetIndex(int[] array, int TargetNumber) {
        for (int i = 0; i < array.length; i++) {
            if (TargetNumber == array[i]) {
                return i;
            }
        }

        return -1;
    }

    /*
     * We will see if the element exists in the array or Not
     *
     * */
    public  boolean isFound(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }

        }
        return false;
    }

    /*
     * We will make function to get the distinctValues From the array
     *
     * */
    public  int[] getDistinctValues(int[] array) {
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
    public  int getMax(int[] array) {
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
    public  int sumOfArray(int[] array) {
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
    public  void divideNumbers(int number) {
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

    public  int days(int month, int year) {
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

    public  int userInput() {
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

    public  void taskToDo(int number) {
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
    public  int sumOfTenNumbers() {
        // You have to look for Three parts initialization condition and updateStatement
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public  int comparison(int first, int second) {
        if (first > second) {
            return first;
        } else return second;
    }

    /*
    // Task
    Grading System: Create a grading system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
    * Grading System: Create a grading
    * system where the user inputs a score, and the program outputs the grade (A, B, C, D, F) using ‘else if’ statements.
    * */
    public  String checkGrade(int grade) {
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
