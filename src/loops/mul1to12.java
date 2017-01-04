/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author miracle
 */
public class mul1to12 {
    public static void main(String[] args) {
        int i,j;
       
        for(i=1;i<=12;i++)
        {
            for(j=1;j<=10;j++)
            {
               int mul=i*j;
                System.out.println(i+"*"+j+"="+mul);
                
                
               
            }
            System.out.println("\n");
        }
        
    }
}
