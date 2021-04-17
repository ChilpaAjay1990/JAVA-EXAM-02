/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ajay Chilpa
 */
public class OneDarray {

    public static void removeDuplicate(ArrayList<Integer> list) {
        int i, a, b, j;
        System.out.print("The distinct integers are : ");
        for (i = 0; i < list.size(); i++) {
            a = list.get(i);
            for (j = i + 1; j < list.size(); j++) {
                b = list.get(j);
                if (a == b) {
                    list.remove(j);
                    j = j - 1;
                }
            }
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Solution for Question 1 : Ajay Chilpa");
        int s, i;
        System.out.print("Enter ten Integers: ");
        for (i = 0; i < 10; i++) {
            s = sc.nextInt();
            list.add(s);
        }
        removeDuplicate(list);
    }
}
