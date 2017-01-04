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
public class compute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,max=0,min=0;
        int arr[]=new int[10];
        System.out.println("Enter ten numbers");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        sum+=arr[i];
        int avg=sum/10;
        if(max<arr[i])
            max=arr[i];
        }
            
        
        
        
    }
}
