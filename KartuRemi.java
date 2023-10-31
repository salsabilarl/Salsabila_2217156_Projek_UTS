/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karturemi;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author salsa
 */
public class KartuRemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenisKartu = (int)(Math.random() * 4) + 1;
        int nomorKartu = (int)(Math.random() * 13) + 1;
        
        int countTebakJenis = 0;
        int countTebakNomor = 0;
        
        System.out.println("-----------------------------------\r\n  *****  TEBAK  KARTU  REMI  *****\r\n-----------------------------------");
        
        System.out.println("\r\nMENEBAK JENIS KARTU");
        while(true){
            System.out.print("\r\nMasukan tebakan jenis kartu! \r\n(1 = Berlian, 2 = Sekop, 3 = Hati, 4 = Keriting)\r\n");
            int tebakJenis = input.nextInt();
            countTebakJenis++;
            
            if (tebakJenis<1 || tebakJenis>4){
                System.out.println("Input Tidak Valid");
            }else if (tebakJenis == jenisKartu){
                System.out.println("Benar");
                break;
            }else{
                System.out.println("Salah. Coba lagi!");
            }
        }
        
        System.out.println("\r\nMENEBAK NOMOR KARTU");
        while(true){
            System.out.println("\r\nMasukan tebakan nomor kartu!\r\n(1 = As, 2-10, 11 = Jack, 12 = Queen, 13 = King)");
            int tebakNomor = input.nextInt();
            countTebakNomor++;

            if(tebakNomor<1 || tebakNomor>13){
                System.out.println("Input Tidak Valid");
            }else if (tebakNomor == nomorKartu){
                System.out.println("Benar");
                break;
            }else{
                System.out.println("Salah. Coba lagi!");
            }
        }
        
        System.out.println("\r\nSelamat, Anda menang setelah " +countTebakJenis +" kali menebak jenis, dan " +countTebakNomor +" kali menebak nomor.");
    }
}
