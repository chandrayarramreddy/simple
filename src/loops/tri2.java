/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author miracle
 */
public class tri2 {
    public static void main(String[] args) {
        int j;
        for(int i=1;i<=4;i++)
        {
            for( j=4;j>=i;j--)
            
                System.out.print(" "+"  ");
            
            for(int k=i;k>=1;k--)
            
                System.out.print(k+" "+" ");
            
            for(int t=2;t<=i;t++)
            
                System.out.print(t+"  ");
                
            
               System.out.println(" ");
            }
      // System.out.println("");
        }
    }
