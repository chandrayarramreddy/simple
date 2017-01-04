
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class cube {
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int cube=(int) Math.pow(n,3);


System.out.println("The Cube of Number is : "+cube);

} 
}
