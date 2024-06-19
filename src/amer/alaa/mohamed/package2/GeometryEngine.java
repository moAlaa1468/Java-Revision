package amer.alaa.mohamed.package2;

public class GeometryEngine {
    public double calculateRectangleArea(double width, double length){
        return width * length;
    }


    //This is just method overloading uaAmer Good ..
    public double calculateRectangleArea(Rectangle rect){
        return rect.getLength() * rect.getWidth();
    }
}
