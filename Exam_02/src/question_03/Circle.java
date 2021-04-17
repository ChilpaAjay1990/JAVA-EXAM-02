/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

/**
 * This is Circle Class
 *
 * @author Ajay Chilpa
 */
public class Circle {

    private int area;
    private String type;

    public Circle(int area, String type) {
        this.area = area;
        this.type = type;
    }

    @Override
    public String toString() {
        return "The area of Circle is " + area + " and it is of " + type + " type";
    }

}
