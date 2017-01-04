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
public class perfect {
    public static void main(String[] args) {
        int i=1,sum=0;
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        while(i<n)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i=i+1;
        }
        if(n==sum)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
    }
    
}
