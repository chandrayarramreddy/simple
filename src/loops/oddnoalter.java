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
public class oddnoalter {
    public static void main(String[] args) {
        int a[]=new int[8];
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array of elements");
        for( i=0;i<a.length;i++)
        {
            
            a[i]=s.nextInt();
            
        }
        
     for(i=0;i<a.length;i++)
      {
        if(i%2==0)
        {
            System.out.println("Alternate Even No's are:"+a[i]);
           i+=2;
        }
       }
    }
}
