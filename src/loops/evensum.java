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
public class evensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the no. upto which you need even no's");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {  
                System.out.println(+i);
                sum=sum+i;
            }
         
           }
        System.out.println("sum is"+" "+sum);
    }
}
