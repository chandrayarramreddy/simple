/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bak;

/**
 *
 * @author miracle
 */
public class Student 
{
    int Studentid;
    String Studentname;
    String Studentdepart;
    public void initStudent(String name,String depart,int id) 
         
    {
       Studentid=id;
       Studentname=name;
       Studentdepart=depart;
       
    }
    
    public void display()
    {
        System.out.println("The Student Name is" +Studentname);
        System.out.println("The Student Department is" +Studentdepart);
        System.out.println("The Student id is" +Studentid);
        
    }
    public static void main(String args[])
    {
       Student s=new Student();
       s.initStudent("Chandra","ECM",5168);
       s.display();
    }
}
