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
public class BinarytoDecimal {
     public static void main(String[] args) {
        int i,j=0,power=0;
        System.out.println("enter the num to convert binary to decimal");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        while(s>0)
        {
            i=s%10;
            j+= i*Math.pow(2, power);
            s=s/10;
            power++;
            
        }
        System.out.println(j);
    }
}
