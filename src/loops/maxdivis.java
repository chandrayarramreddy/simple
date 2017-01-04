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
public class maxdivis {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int big=0;
        int n=0;
        for(int i=1;i<10000;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+1;
                    //System.out.println(i+"the number is"+sum);
                }
                if( sum>big)
                {
                    //if (divisorCount > maxDivisors) {
                 //maxDivisors = divisorCount;
                 //numWithMax = N;//
                    big=sum;
                    n=i;
                   
                }}}
                System.out.println(  n+"the biggest divisor number is"+big);
                }
                      
            }
       
        
        
        
   
