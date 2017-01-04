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
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0,rem=0;
        int m=n;
         while(n>0)
       {
           rem=n%10;
           sum=sum*10+rem;
           n=n/10;
           
       }
         if(m==sum)
         {
             System.out.println("number is palindrome");
            
         }
         else
         {
             System.out.println("number is not palindrome");
         }
    }
}
