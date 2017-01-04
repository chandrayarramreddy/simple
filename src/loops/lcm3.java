/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author miracle
 */
public class lcm3 {
    public static void main(String[] args) {
        int s=12,a=3,b=5,m=1;  // any numbers can initialize 
        for(int i=1;;i++)
        {
            m=i*a;          // multiple times loop times
            if((m%s==0&&m%a==0)&&m%b==0)   //each condition checks by module division...
            {
                break;
            }
        }
                               System.out.println("lcm is "+m);

        }
    }

