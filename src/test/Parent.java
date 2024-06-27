/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author moham
 */
public  class Parent {
   
    private String name;
    private String address;
//    
//    public Parent(){
//        //This is just empty Constructor
//    }
//    
  public  Parent(String name){
        this.name=name;
        System.out.println("This is the parent constructor");
        System.out.println("The name of the super class is "+name);
    }
  
  public Parent(String address,String name){
      this.name=name;
      this.address=address;
  }
  
  
  
  //These are some methods
    final public void again(){  // This is final field the last definition uaAmer 
   /*
        This is used to make the method final 
        without chaninging by the children ==> This is the concept of inheritance uaAmer
        */
        System.out.println("This is the jstu the end of teh course");
    }
    
    
    
}
