/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

import java.util.ArrayList;
import java.util.Date;

/**
 * This is main class
 *
 * @author Ajay Chilpa
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> al = new ArrayList<Object>();
        System.out.println("Solution for Question 3 : Ajay Chilpa");
        Loan l = new Loan("Mortgage", 10.5);
        Date d = new Date();
        Circle c = new Circle(20, "semicircle");
        String s = "adding the satetements";
        al.add(l);
        al.add(d);
        al.add(s);
        al.add(c);
        for (Object a : al) {
            System.out.println(a.toString());
        }
    }

}
