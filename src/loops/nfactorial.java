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
public class nfactorial {
    
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factoial you want");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
        
    }
    
 }  
