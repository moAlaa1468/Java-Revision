package amer.alaa.mohamed.abstraction;

public class Man extends Person {

    public Man() {
        super();
    }

    public Man(String name, int age, int phoneNumber, String address) {
        super(name, address, age, phoneNumber);
    }

    @Override
    public void setName() {

    }

//    @Override
//    public String toString() {
//        return "Man{" +
//                "name='" + name + '\'' +
//                ", Address='" + Address + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public void personInformation() {

    }

    @Override
    public void setPhoneNumber() {

    }

    @Override
    public void setAge() {

    }

    @Override
    public void setAddress() {
    }


    //we need to create the main method here
    public static void main(String[] args) {
        Person man = new Man("Mohamed Alaa amer ", 23, 223232323, "Cairo , Egypt");
        System.out.println(man.toString());
    }


}
