/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_03;

/**
 * This is Loan Class
 *
 * @author Ajay Chilpa
 */
public class Loan {

    private String type;
    private double interest;

    public Loan(String type, double interest) {
        this.type = type;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Loan is of type " + type + " and intrest of " + interest;
    }

}
