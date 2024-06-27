/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amer.alaa.mohamed.package2;

/**
 *
 * @author moham
 */
public class Rectangle {
    private float width;
    private float height;
    private float perimeter;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
    
   public double area(){ // This function doesn't not require parameters
      return width*height;   }
   
  
}
