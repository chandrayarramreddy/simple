
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class areacircle {
    
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      
      double radius = sc.nextDouble();
    
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
     
   }
}
