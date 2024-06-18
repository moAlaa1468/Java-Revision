public class Main{
    public static void main(String[] args){
    int firstNumber=20;
    int secondNumber=30;
    //This is the operator Overloading
        // left precedence 
        System.out.println(firstNumber+secondNumber ); //adding Not Casting to String
        System.out.println("Sum is : "+firstNumber + secondNumber); //this will casting to String
        System.out.println(firstNumber+secondNumber + "<= Sum"); // This will add then casting String
    }
}