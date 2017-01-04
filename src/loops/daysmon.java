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
public class daysmon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Month");
    String s=sc.next();
    
    switch(s)
    {
        case "january" :
            System.out.println("This month contains 31 DAYS ");
            break;
        case "febuary" :
            System.out.println("This month consists 28/29 DAYS");
            break;
        case "march" :
            System.out.println("This month consists 31 DAYS");
            break;
        case "april" :
            System.out.println("This month consists 30 DAYS");
            break;
        case "may" :
            System.out.println("This month consists 31 DAYS");
            break;
        case "june" :
            System.out.println("This month consists 30 DAYS");
            break;
        case "july" :
            System.out.println("This month consists 31 DAYS");
            break;
        case "august" :
            System.out.println("This month consists 31 DAYS");
            break;
        case "september" :
            System.out.println("This month consists 30 DAYS");
            break;
        case "october" :
            System.out.println("This month consists 31 DAYS");
            break;
        case "november" :
            System.out.println("This month consists 30 DAYS");
            break;
        case "december" :
            System.out.println("This month consists 31 DAYS");
            break;
        default :
            System.out.println("No such month found");
            break;
    }
    
    }
    
    
}
