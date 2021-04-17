/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

/**
 * This is a enum class
 *
 * @author Ajay Chilpa
 */
public enum CakeSize {
    SMALL(10), MEDIUM(15), LARGE(20);

    CakeSize(int price) {
        this.price = price;
    }
    private int price;

    public int getPrice() {
        return price;
    }
}
