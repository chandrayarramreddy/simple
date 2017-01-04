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
public class fabnoci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibonacci");
        int i=0;
        int n=15;
        int a=0,b=1,c;
        while(i<=n)
        {
            System.out.println("fibonacci of"+i+"is:"+a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
    
}
