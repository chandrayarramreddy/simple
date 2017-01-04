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
public class sectoHr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of seconds to convert into Hours");
        int seconds=sc.nextInt();
        final int SECONDS_PER_HOUR=3600;
        float hours=(float)seconds/SECONDS_PER_HOUR;
        System.out.println(hours+" Hours");
        
        
        
        
        
        
                
    }
}
