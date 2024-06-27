package amer.alaa.mohamed.interfaces;

public  class Traingles implements HasPerimeter, HasArea {
    private int side;

    Traingles(){}
    public Traingles(int side) {
        this.side= side;
    }

    @Override
    public float calculateArea() {
        return side*side;
    }



    @Override
    public float calculatePerimeter() {
        return side+side;
    }
}
