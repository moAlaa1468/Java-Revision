package amer.alaa.mohamed.abstraction;

public abstract class Person {

    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    public Person(){}
    public Person(String name, String address, int age, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public abstract void setName();
    public abstract void setAddress();
    public abstract void setAge();
    public abstract void setPhoneNumber();

    //Hint this abstract class But have implementation of some methods

    public void personInformation(){
        System.out.println("this some implementation for a method " +
                "inside the abstract class");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
