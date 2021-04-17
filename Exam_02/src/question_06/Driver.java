/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_06;

import java.util.Scanner;

/**
 * This is a main class
 *
 * @author Ajay Chilpa
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Solution for Question 6 : Ajay Chilpa");
        System.out.print("Enter side1 : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 : ");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter color : ");
        String color = sc.nextLine();
        System.out.print("Is triangle filled with color?" + " (True or False): ");
        boolean isFilled = sc.nextBoolean();
        Triangle t = new Triangle(isFilled, color, side1, side2, side3);
        System.out.println(t.toString());
    }
}
