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
public class dowhile {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. upto which you need even no's");
        int n=sc.nextInt();
       // for(int i=1;i<=n;i++)
        int i=1;
       // while(i<n)
        do
        {
            if(i%2==0)
                System.out.println(+i);
            i++;
        }while(i<n);
       // System.out.println("Are up to"+" "+n+" "+"even numbers");
    }
}
