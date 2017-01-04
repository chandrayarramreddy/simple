/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *while [ $number -gt 0 ]

do

rem=`expr $number % 10`

number=`expr $number \/ 10`

sum=$(($sum+$rem))

 * @author miracle
 */
public class nodigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem=0,count=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();
       while(n>0)
       {
           rem=n%10;
           n=n/10;
           count=count+1;
       }
        System.out.println(+count);
    }
    
}
