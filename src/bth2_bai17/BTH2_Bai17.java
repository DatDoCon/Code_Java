/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bth2_bai17;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class BTH2_Bai17 {

   
    public static void main(String[] args) {
        String chuoi ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi nhap vao chuoi cua ban: ");
        chuoi = sc.nextLine();
        
        char[] arr = chuoi.toCharArray();
        
        if (arr[0] >'Z') arr[0] -= 32;
        for (int i =0; i<arr.length; i++)
        {
            if ((arr[i] == ' ' && arr[i+1]!= ' ')&& (arr[i+1])>'Z')
            {
                arr[i+1] -= 32;
            }
        }
        
        for (char a : arr)
        {
            System.out.print(a);
        }
    }
    
}
