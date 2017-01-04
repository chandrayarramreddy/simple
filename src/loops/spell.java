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
public class spell {
    public void spell1( int n)
   { 
       switch(n) 
{
    case 1:
        System.out.println("one");
        break;
    case 2:
        System.out.println("two");
        break;
    case 3:
       System.out.println("three");
        break;
    case 4:
        System.out.println("four");
        break;
     case 5:
        System.out.println("five");
        break;
     case 6:
        System.out.println("six");
        break;
     case 7:
        System.out.println("seven");
        break;
      case 8:
        System.out.println("eight");
        break;
      case 9:
        System.out.println("nine");
        break;
      case 0:
        System.out.println("zero");
        break;
      default:
        System.out.println("invalid choice");
    
}
   }
    public static void main(String[] args) {
        spell r= new spell();
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int c=sc.nextInt();
        r.spell1(c);
    }
}
