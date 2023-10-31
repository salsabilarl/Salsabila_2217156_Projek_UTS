/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jajarangenjang;

/**
 *
 * @author salsa
 */
public class Main {
    public static void main(String[] args) {
        JajaranGenjang jajarGenjang = new JajaranGenjang();
        System.out.println("Jajar genjang default memiliki sisi miring " +jajarGenjang.sisiMiring +",alas " + jajarGenjang.alas +", dan tinggi " +jajarGenjang.tinggi);
        
        JajaranGenjang newJajarGenjang = new JajaranGenjang(6, 8, 5);
        System.out.println("\r\n Jajaran Genjang");
        System.out.println("Alas : " + newJajarGenjang.alas);
        System.out.println("Tinggi : " + newJajarGenjang.tinggi);
        System.out.println("Luas : " + newJajarGenjang.getLuas());
        System.out.println("Keliling : " + newJajarGenjang.getKeliling());
    }
    
}
