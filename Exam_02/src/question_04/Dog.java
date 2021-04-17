/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04;

/**
 * This is a Sub class(Dog) of pet animal class
 *
 * @author Ajay Chilpa
 */
public class Dog extends PetAnimal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void sound() {
        System.out.println("Bow Bow Bow ");
    }
}
