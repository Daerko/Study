package ua.univer.Task5;

public class Rectangle {

    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public Rectangle(double aSide){
        this(aSide, 5);
    }

    public Rectangle(){
        this(4,3);
    }

    public double getSideA() {
        return aSide;
    }

    public double getSideB() {
        return bSide;
    }

    public double getArea() {
        return aSide * bSide;
    }

    public double getPerimeter() {
        return 2 * (aSide + bSide);

    }

    public boolean isSquare() {
        return aSide == bSide;
    }

    public void replaceSide() {
        double temp=aSide;
        aSide=bSide;
        bSide=temp;
    }
}