/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amer.alaa.mohamed.package1;

import amer.alaa.mohamed.interfaces.Circle;
import amer.alaa.mohamed.interfaces.HasArea;
import amer.alaa.mohamed.interfaces.HasPerimeter;
import amer.alaa.mohamed.interfaces.Traingles;

import java.awt.*;

/**
 *
 * @author moham
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to our new project");
        System.out.println("This is just the power of interfaces uaAlaa  ");
        HasArea circleArea=new Circle();
        HasPerimeter ciclePerimeter=new Circle();
        HasArea traingleArea=new Traingles(2);
        HasPerimeter trainglePerimeter=new Traingles(3);
        System.out.println("You could take reference from the Interface But you will not be able to " +
                "Take Object from the interfaces because they are not completed");
        System.out.println(traingleArea.calculateArea());
        System.out.println(trainglePerimeter.calculatePerimeter());

    }
    //this is not the end of mohamed Alaa amer ... 

    //This is not the end of the files All the files
   
}
