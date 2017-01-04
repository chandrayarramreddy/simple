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
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to find whether leap or not");
        int year =sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println(year+" "+"is leap");
        else
            System.out.println(year+" "+"is not loop");
            
            
            
    }
}
