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
public class Validrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter valid input");
        int n1=sc.nextInt();
        if(n1<11&&n1>0)
        {
            System.out.println("input is in range");
        }
        else
        {
            System.out.println("not in range");
        }
        
    }
}
