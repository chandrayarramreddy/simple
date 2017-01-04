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
public class altersum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int i;
        int sum=0;
        for( i=1;i<=num;i=i+2)
        {
            
            sum=sum+i;}
            System.out.println("the numbers are"+sum);
        }
            
}
