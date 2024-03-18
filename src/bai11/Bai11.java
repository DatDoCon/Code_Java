/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Bai11 {

   
    public static void main(String[] args) {
        int[][] arrInt;
         int i , j ;
         // Input
        System.out.println("Nhap vao kich thuoc cua mang [i][j]");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao [i]");
        i = sc.nextInt();
        System.out.println("Nhap vao [j]");
        j = sc.nextInt();
        arrInt = new int[i][j];
        for (int k =0; k<i; k++)
        {
            for (int h = 0; h<j; h++)
            {
                int tg;
                System.out.println("Nhap vao arr["+k+"] " +"["+h+"]");
                tg = sc.nextInt();
                while (true)
                {
                    if (tg<=1)
                    {
                        System.out.println ("Ban Nhap Sai Roi! Vui long nhap so nguyen to");
                        tg = sc.nextInt();
                    }
                    for (int n =2; n<=Math.sqrt(tg); n++)
                    {
                        if (tg%n==0)
                        {
                            System.out.println ("Ban Nhap Sai Roi! Vui long nhap so nguyen to");
                            tg = sc.nextInt();
                        }
                    } 
                    arrInt[k][h] = tg;
                    break;
                }
            }
        }
    
        // in ra mang
        System.out.println(Arrays.deepToString (arrInt));
        
        int max=0;
        for (int[] findmax : arrInt)
        {
            for (int value: findmax)
            {
                if (value > max)
                {
                    max = value;
                }  
            }
        }
        System.out.println("So nguyen to lon nhat trong mang la: "+ max);
    }
    
}
