/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class readchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Initial");
        char YourFirstInitial=sc.next().charAt(0);
        System.out.println("YourFirstInitial "+YourFirstInitial);
    }
}
