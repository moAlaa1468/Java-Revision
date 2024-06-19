package amer.alaa.mohamed.package2;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private double length;
    private double width;

    //HAS INPUT But has no output
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

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
}
