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
public class speakdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int rev=0;
        int rem=0;
        int rvv=0;
        while(num>0){
            rem=num%10;
             rev=rev*10+rem;
             num=num/10;
        }while(rev>0)
        {
            rvv=rev%10;
            rev=rev/10;
            switch(rvv)
                    {
                case 0:System.out.println("zero"+" ");
                break;
                 case 1:System.out.println("one" +" ");
                 break;
                 case 2:System.out.println("two" +" ");
                 break;
                 case 3:System.out.println("three"+" ");
                 break;
                 case 4:System.out.println("four");
                 break;
                 case 5:System.out.println("five");
                 break;
                 case 6:System.out.println("six");
                 break;
                 case 7:System.out.println("seven");
                 break;
                 case 8:System.out.println("eight");
                 break;
                  case 9:System.out.println("nine");
                  break;
                      
            }}}
}
