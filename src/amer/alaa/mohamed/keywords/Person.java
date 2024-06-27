package amer.alaa.mohamed.keywords;

public class Person {
    private static int counter;

    public Person(){
        counter++;
    }

    public static void testStatic() {
        System.out.println("This is static funciton uaAmer ");
        System.out.println("This si jsut single version of this function uaAmer ");
    }

    public static void print() {
        System.out.println("You don't neeed to to take object from this method" +
                "This is related to the class not related to anyy object uaAmer");
    }

    public static  int getCounter() {
        return counter;
    }
}
