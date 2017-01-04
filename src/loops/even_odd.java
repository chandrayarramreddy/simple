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
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+" "+":is even ");
        else
            System.out.println(n+" "+":is odd");
    }
}
