/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

/**
 * This is Triangle Class
 *
 * @author Ajay Chilpa
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(boolean isFilled, String color, double side1,
            double side2, double side3) {
        super(isFilled, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return ((this.side1 + this.side2 + this.side3));

    }

    @Override
    public double getArea() {
        double p1 = this.getPerimeter() / 2;
        return Math.pow(p1 * (p1 - side1) * (p1 - side2) * (p1 - side3), 0.5);
    }

    @Override
    public String toString() {
        return "Area: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter()
                + "\nColor:" + this.getColor()
                + "\nFilled: " + this.isIsFilled();
    }
}
