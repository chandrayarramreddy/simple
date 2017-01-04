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
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Squares of number from 1 to 20"); 
        for(int i=1;i<21;i++)
        {
            int square=(int) Math.pow(i,2);
            System.out.println(i+"s"+" "+"square is"+""+square);
        }
    }
}
