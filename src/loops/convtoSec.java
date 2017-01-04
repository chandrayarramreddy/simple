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
public class convtoSec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours to convert to seconds");
        int hours=sc.nextInt();
        int seconds=3600*hours;
        System.out.println("Number of Seconds in  "+hours+" hours are "+seconds);
        
    }
}
