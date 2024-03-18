/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith2.b14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class BaiTH2B14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arr;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhap vao chuoi cua ban(vui long nhap khong cach)");
        arr = sc.nextLine();
        System.out.println(arr);
        
        char[] arrCh = arr.toCharArray();
        int n = arrCh.length;
        for (int i =0; i<arrCh.length; i++)
        {
            for (int j = i+1; j<arrCh.length; j++)
            {
                if (arrCh[i] == arrCh[j] && (arrCh[i] != ' ' || arrCh[j] != ' ')) {
                    n -= 1;
                }
            }
        }
        
        System.out.println ("So ki tu khac nhau la: "+ n);
            
    }
}
    

