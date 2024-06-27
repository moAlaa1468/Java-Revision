package amer.alaa.mohamed.abstraction;

public class Woman extends Person{

    public Woman() {
        super();
    }

    public Woman(String name, String address, int age, int phoneNumber) {
        super(name, address, age, phoneNumber);
    }

    @Override
    public void setName() {

    }

    @Override
    public void setAddress() {

    }

    @Override
    public void setAge() {

    }

    @Override
    public void setPhoneNumber() {

    }

    @Override
    public void personInformation() {
        super.personInformation();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args){
        Person woman=new Woman("yaraAmer","Cairo , Egypt",2323,42347);
        System.out.println(woman.toString());
    }
}
