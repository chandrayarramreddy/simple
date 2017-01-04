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
public class digchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter the Digit or Character");
        int  n1=sc.nextInt();
        char n2=sc.next().charAt(0);
        System.out.println("Entered number is:"+n1);
        System.out.println("Entered Character is:"+n2);
    }
}
