package amer.alaa.mohamed.package1;
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
//        int[] numbers = {22, 33, 44, 55, 10, 20, 20, 33, 22};
//
//        int[] result = getDistinctValues(numbers);
//        for (int i = 0; i < result.length; i++) {
//            if (result[i] != 0) {
//                System.out.print(result[i] + "   ");
//            }
//        }
//
//        System.out.println();
//        int[] reverseArray = reverseArray(numbers);
//        for (int i = 0; i < reverseArray.length; i++) {
//            System.out.print(reverseArray[i] + "   ");
//
//        }
//
//        System.out.println();
//        int targetElement = getTargetIndex(numbers, 55);
//        System.out.println("Index of the target element is : "+targetElement);
//
//        boolean found = isFound(numbers, 55);
//        System.out.println(found);


//        int[] numbers = { 29, 22, 0, 44, 22, 10, 20, 20, 33, 22};
//        int[] result = distinctTwo(numbers);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print("  " + result[i]);
//        }


import amer.alaa.mohamed.package2.ArrayEngine;
import amer.alaa.mohamed.package2.GeometryEngine;
import amer.alaa.mohamed.package2.Rectangle;
import amer.alaa.mohamed.package2.Second;

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second.toString());
        GeometryEngine geometryEngine = new GeometryEngine();
        double area = geometryEngine.calculateRectangleArea(10, 20);
        System.out.println(area);

        Rectangle rectangle = new Rectangle(10, 20);
        double result = geometryEngine.calculateRectangleArea(rectangle.getWidth(), rectangle.getLength());
        System.out.println(result);

        double area1 = geometryEngine.calculateRectangleArea(new Rectangle(99, 20));
        System.out.println(area1);

        /*
         * we need to use copy constructor uaAlaa
         * */

        Rectangle r1 = new Rectangle(90, 2);
        //use copy constructor to copy the values in the r1 to r2
        Rectangle r2 = new Rectangle(r1);
        double areaOfRectangle = r2.area();
        System.out.println("Your Rectangle area is :");
        System.out.println(areaOfRectangle);

    }

}