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
public class prime {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number");
        int n1=sc.nextInt();
     //   int n2=sc.nextInt();
        for(i=2;i<=n1;i++)
            
        {
            int count=0;
            for(j=1;j<=i;j++)
            { 
                if(i%j==0)
                {
                    count=count+1;
                }
            }
           
            //if(n1%i==0)
              //  count=count+1;
                     //   System.out.println(+n2);
        
        if(count==2)
        {
            System.out.println(i+ "is prime");
        }
       // else
       // {
      //      System.out.println(i+" not");
      //  }
        }
       
        
        
    }
}
