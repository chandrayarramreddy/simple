
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class simpleswitch {
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Choice");
System.out.println("1.Add \n 2.sub \n 3.mul \n 4.div");
int n=sc.nextInt();
System.out.println("Enter the value of a:");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
int c;
switch(n)
{
case 1:
c=a+b;
System.out.println("Addition is :"+c);
break;
case 2:
c=a-b;
System.out.println("Subtraction is :"+c);
break;
case 3:
c=a*b;
System.out.println("multipliction is "+c);
break;
case 4:
c=a/b;
System.out.println("Division is "+c);
break;

default:
System.out.println("Option not valid");
break;

}
}
}
