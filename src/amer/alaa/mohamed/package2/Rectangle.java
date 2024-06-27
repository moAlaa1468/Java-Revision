package amer.alaa.mohamed.package2;

import org.w3c.dom.css.Rect;
<<<<<<< HEAD
/*
* Overloading methods
* is just overloading for another developers who will use the your created class
* */

public class Rectangle extends Shape{
    private double length;
    private double width;


    /*
    * we need to create empty constructor uaAmer
    * */
    public Rectangle(){}

=======

public class Rectangle {
    private double length;
    private double width;

>>>>>>> 559db59c289d34dcc7bd751c1ee9da4b91511721
    //HAS INPUT But has no output
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
<<<<<<< HEAD
    //we make overloading constructor for the User
//    public Rectangle(double length){
//        this.length=length;
//        this.width=1;
//    }


    //Just we will make overloading For the user
//    public Rectangle(double width,float length){
//        this.width=width;
//        this.length=1;
//    }

    /*
    * Let's make simple copy constructor
    * */
    public Rectangle(Rectangle rect){
        this.length=rect.length;
        this.width=rect.width;
    }

=======
>>>>>>> 559db59c289d34dcc7bd751c1ee9da4b91511721

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
<<<<<<< HEAD
    public double area()
    {
        return (this.length * this.width);
    }

=======
>>>>>>> 559db59c289d34dcc7bd751c1ee9da4b91511721
}
