package amer.alaa.mohamed.package2;

<<<<<<< HEAD
public class Circle extends Shape {
=======
public class Circle {
>>>>>>> 559db59c289d34dcc7bd751c1ee9da4b91511721
    private float radius;
    private final float pi=3.14f;
    // final is a constant
    //لتعريف الاول والاخير لهذه القيمة

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }





    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
