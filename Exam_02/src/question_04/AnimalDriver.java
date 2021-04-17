/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04;

/**
 * This is main class
 *
 * @author Ajay Chilpa
 */
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Question 4 : Ajay Chilpa");
        PetAnimal a1 = new PetAnimal("Duke", "Brown");
        PetAnimal a2 = new Dog("Brownie", "Dotted Black and White");
        PetAnimal a3 = new Cat("Rambo", "White");
        System.out.println("Duke make sounds as ");
        a1.sound();
        System.out.println("**************************");
        System.out.println("Brownie barks as ");
        a2.sound();
        System.out.println("**************************");
        System.out.println("Rambo make sound as ");
        a3.sound();
        System.out.println("**************************");
    }

}
