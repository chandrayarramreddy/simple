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
public class multipli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table you need to print");
        int n=sc.nextInt();
      //  for(int i=1;i<11;i++)
        int i=1;
        do
        {
           int m=n*i;
            System.out.println(n+"*"+i+"="+m);
            i++;
        }while(i<11);
    }
}
