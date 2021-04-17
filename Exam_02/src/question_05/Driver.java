/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_05;

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
        Person per = new Person("Dawnyne Jhonson");
        Student stu = new Student("Amy Jackson");
        Employee emp = new Employee("James Smith");
        Faculty fac = new Faculty("Maria Rodriguez");
        Staff sta = new Staff("John Williams");
        System.out.println("Solution for Question 5 : Ajay Chilpa");
        System.out.println(per.toString());
        System.out.println("**************************");
        System.out.println(stu.toString());
        System.out.println("**************************");
        System.out.println(emp.toString());
        System.out.println("**************************");
        System.out.println(fac.toString());
        System.out.println("**************************");
        System.out.println(sta.toString());
        System.out.println("**************************");
    }

}
