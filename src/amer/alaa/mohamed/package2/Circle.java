package amer.alaa.mohamed.package2;

public class Circle extends Shape {
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
