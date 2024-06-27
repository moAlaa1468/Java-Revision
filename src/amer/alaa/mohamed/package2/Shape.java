package amer.alaa.mohamed.package2;

public class Shape {
    //this should be the parent class...
    protected double area;
    protected double perimeter;


    public double calculatePerimeter(){
        return perimeter;
    }

    public double calculateArea(){
        return  area;
    }

    @Override
    public String toString() {
        return super.toString(); // this is from the Object Class
    }
}
