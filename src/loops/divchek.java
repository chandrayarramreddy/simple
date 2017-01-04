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
public class divchek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to Divide");  
        int n=sc.nextInt();
        if((n%3)==0 && (n%5)==0)
            System.out.println(n+" "+"is divisible by both 3 and 5");
        else
            System.out.println(n+" "+"is not divisible by either 3 or 5 ");
    }
}
