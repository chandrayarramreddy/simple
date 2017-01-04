
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class sumavg {
     public static void main(String[] args) 
    {
        int sum = 0;
        float avg;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        avg = (float)sum / n;
        System.out.println("Average:"+avg);
    }
}
