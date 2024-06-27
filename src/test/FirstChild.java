/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import test.Parent;
/**
 *
 * @author moham
 */
public class FirstChild extends Parent{
    String address;
    
    
    //String class is final ==> This prevents all childrens from override any functions in it 
//    public FirstChild() { //This is just empty constructor uaAmer 
//   // This constructor will override the parent One fi you added the same Parameters 
//        System.out.println("This is the child constructor");
//    }
//    
    
//    public FirstChild(String name,String Address, int id ){
//        super(name,Address); // This si the second constructor
//        this.address=Address;
//        System.out.println("This is the child One uaAmer ");
//    }
// 
    public FirstChild(String name){
        super(name);
        System.out.println("What is the coming tasks");
    }
    
    public FirstChild(){
        super("Mohamed Alaa amer is here ");
        System.out.println("super is called uaAmer  ");
    }
    
    
  
//    @Override
//    public void again(){
//        System.out.println("This is not the overrided method");
//    }
//    This function is not overridable 
}
