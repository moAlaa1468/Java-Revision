package amer.alaa.mohamed.package2;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    
    private double angleBetween1And2;
    private double angleBetween1And3;
    private double angleBetween2And3;

    public double getAngleBetween1And3() {
        return angleBetween1And3;
    }

    public void setAngleBetween1And3(double angleBetween1And3) {
        this.angleBetween1And3 = angleBetween1And3;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getAngleBetween1And2() {
        return angleBetween1And2;
    }

    public void setAngleBetween1And2(double angleBetween1And2) {
        this.angleBetween1And2 = angleBetween1And2;
    }

    public double getAngleBetween2And3() {
        return angleBetween2And3;
    }

    public void setAngleBetween2And3(double angleBetween2And3) {
        this.angleBetween2And3 = angleBetween2And3;
    }

    //make empty constructor
   public Triangle(){}

    /*
    * All side of the Triangle are equal
    * */
   //متساوي الاضلاع
   public Triangle(double sideOne){
        this.sideOne=this.sideTwo=this.sideThree=sideOne;
        //This is so great mission uaAmer
    }

   //متساوي الساقين 
//jUST TO SIDES ARE EQUAL
  public  Triangle(double sideOne,double sideThree,float angleBetween1And2){
        this.sideOne = this.sideTwo=sideOne;
        this.sideThree=sideThree;
        this.angleBetween1And2=angleBetween1And2;
    }
  
  
//  مختلف الاضلاع
   public Triangle(double sideOne,double sideThree,double sideTwo){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }

    /*
    * We need to make simple functions fo find area and perimeter
    * we need to make overloaded methods Three methods for area
    * and three methods for perimeter
    * */
    
    //These are methods for finding area of any triangle type
    public double calculateArea(double sideOne,double sideTwo , double angleBetween1And2){
        /*
        * If just two sides are equal to each others
        * */
        return  0.5 * ( sideOne*sideTwo ) * Math.sin(angleBetween1And2);
    }

    public double calculateArea(double sideOne , double anyAngle){
        /*
        * if all sides are equal
        * */
        return 0.5 * sideOne * sideOne * Math.sin(anyAngle);
    }

    public double calculateArea(double sideOne, double sideTwo,double sideThree,double angleBetweenSmallestSides){
        /*
        * If three sides are different from each others
        * */
        double biggestSide=0;
        double area=0;
        if(sideOne>sideTwo && sideOne> sideTwo){
            biggestSide=  sideOne;
            area= sideTwo * sideThree * 0.5 * Math.sin(angleBetweenSmallestSides);
        }else if (sideTwo>sideOne && sideTwo>sideThree){
            biggestSide=sideTwo;
            area= sideTwo * sideOne * 0.5 * Math.sin(angleBetweenSmallestSides);

        }else{
            biggestSide=sideThree;
            area= sideTwo * sideOne * 0.5 * Math.sin(angleBetweenSmallestSides);

        }
        System.out.println("The biggest side here is : "+ biggestSide);
        return area;

    }



    //these methods for finding any triangle perimeter
    public double calculatePerimeter(double sideOne){
        return sideOne + sideOne + sideOne;
    }
    public double calculatePerimeter(double sideOne,double sideTwo){
        return sideOne*sideOne + sideTwo ;
    }
    public double calculatePerimeter(double sideOne,double sideTwo,double sideThree){
        return sideOne+sideTwo+sideThree;
    }


}
