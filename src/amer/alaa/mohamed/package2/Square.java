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
public class Square {
    private float side;
    private float area;
    private float perimeter;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    
    public float CalculateArea(){
        //There is no paramter called side
        // there is no vairable called side 
        return side * side;           
    }
    public float CalculatePerimeter(){
        return 4 * side;
    }

    
}
