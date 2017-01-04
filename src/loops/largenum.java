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
public class largenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println(n1+" :is greater");
        else 
            System.out.println(n2+" :is greater");
    }
}
