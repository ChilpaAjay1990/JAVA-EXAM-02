/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

/**
 * This is a order cake class
 *
 * @author Ajay Chilpa
 */
public class OrderCake {

    private String name;
    CakeSize size;

    public OrderCake(String name, CakeSize size) {
        this.name = name;
        this.size = size;
    }

    public static void main(String[] args) {
        OrderCake oc = new OrderCake("Choclate", CakeSize.SMALL);
        System.out.println("Solution for Question 7 : Ajay Chilpa");
        System.out.println("Order:\n" + "Cake: " + oc.name + "(" + oc.size + ")" + "\nPrice :" + oc.size.getPrice() + "$");
    }

}
