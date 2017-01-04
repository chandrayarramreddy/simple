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
public class comp2num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String a="Numbers are equal";
        String b="Numbers are not equal";
        String c= (n1==n2) ? a : b;
        System.out.println(c);
    }
   
}
