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
public class bigdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int rem=0,big=0;
         System.out.println("Enter the number");
         int n=sc.nextInt();
         while(n>0)
         {
             rem=n%10;
             if(rem>big)
             {
                 big=rem;
                 
             }
             n=n/10;
         }
        System.out.println(+big);
    }
}
