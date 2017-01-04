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
public class DecimaltoBinary {
    public static void main(String[] args) {
        int binary[] = new int[200];
        int j= 0;
        System.out.println("enter the number to convert decimal to binary");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n > 0){
            binary[j] = n%2;
            n = n/2;
            j++;
        }
        for(int i = j-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
