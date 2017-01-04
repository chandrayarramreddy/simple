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
public class armstrong {
    public static void main(String[] args) {
        int arm=0,rem;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int n=sc.nextInt();
        int m=n;
        while(n>0)
        {
            rem=n%10;
            arm=arm+rem*rem*rem;
            n/=10;
            
        }
        
        System.out.println(+arm);
        
        if(m==arm)
        {
            System.out.println("Number is armstrong");
        }
        else
            System.out.println("not armstrong");
    }
}
