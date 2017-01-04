
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class sample {
    
    
    
    //  1) Program to COmpare two Strings
    
    
   /* public static void main(String[] args)
{
String arr[]={"chandra1"};
String arr1[]={"chandra2"};

for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr1.length;j++)

if(arr[i]==arr1[j])
{
System.out.println("String is equal");
}
else
{
System.out.println("String is not equal");
}
}
}*/
    
    
   // 2) array append
    
    
  /*  public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
int arr1[]={6,7,8,9,0};                          //new arr1[arr.length];
for(int i=arr.length;i<10;i++)
{
for(int j=0;j<arr1.length;i++)
{
arr[i]=arr1[j];
}
}
System.out.println("New array is :" +arr1);
} */

    
    // 3) string Replace
    
 /*   public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String st=sc.next();
StringBuffer s=new StringBuffer(st);

int i;
for( i=0 ;i<s.length();i++)
{
  char k= s.charAt(i);
    if(i%2==0)
    {
      if(k>='A'&&k<='Z')
      {
          System.out.print(k);
      }
      else
      {
          char g=(char)(k-32);
          System.out.print(g);
      }
      
        //System.out.println(s.charAt(i));
    }
        else
    {
        System.out.print("()");
    }
        
}


}*/

    
  //  2) array append
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x array size");
        int n=sc.nextInt();
        System.out.println("Enter y array size");
        int m=sc.nextInt();
        
        int x[]=new int[n];
        
        int y[]=new int[m+n];
        int i;
        for(i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        //    y[m+i]=sc.nextInt();
            
        }
            for(i=0;i<x.length;i++)
            {
                y[m+i]=x[i];
            }
            for(i=0;i<y.length;i++)
            {
                System.out.println(y[i]);
            }
        }
    }
    


