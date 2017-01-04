
package bak;

/**
 *
 * @author chandra
 */
public class Bank 
{

String b_name;
String b_loc;
public void initbank(String bn,String bl)
{
b_name=bn;
b_loc=bl;
}
public void display()
{
System.out.println("The Bank Name is "+b_name);
System.out.println("the bank location is "+b_loc);
}
public static void main(String args[])
{
Bank b=new Bank();
b.initbank("Andhra","Visakhapatnam");
b.display();
}
}
    

