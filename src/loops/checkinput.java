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
public class checkinput {
    public static void main(String args[])
  { 
    char i;
   // char input='D';
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the input to check");
      char input=sc.next().charAt(0);
    for( i='A';i<='Z';i++)//check if uppercase
    {
        if(input==i)
        {
            System.out.println("Uppercase");
            
            }

        for(i='a';i<='z';i++)//check if lowercase
        {
            if(input==i){
                System.out.println("Lowercase");
                }


        for(i='0';i<='9';i++)//check if number
        {
            if(input==i)
                System.out.println("Number");
            else
                System.out.println("Special Character");
        }

    }

}
  }
}
