/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04;

/**
 * This is a subclass(cat) of Pet animal class
 *
 * @author Ajay Chilpa
 */
public class Cat extends PetAnimal {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void sound() {
        System.out.println("Meow Meow Meow");
    }
}
