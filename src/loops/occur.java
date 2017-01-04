/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author miracle
 */
public class occur {
    public static void main(String args[])
{
int num=9888,i,n,k;
  
  n=num;
  i=0;
  while(n!=0)
  {
  k=n%10;
  n=n/10;
  if(k==8)
  {
  i++;
  }
  }System.out.println("occurence is"+i);
}
}
