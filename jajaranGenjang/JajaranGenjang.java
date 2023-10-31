/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jajarangenjang;

/**
 *
 * @author salsa
 */
public class JajaranGenjang {
    public double sisiMiring=1, alas=1, tinggi=1;
    
    public JajaranGenjang(){
    }
    
    public JajaranGenjang(double sisiMiring, double alas, double tinggi){
        this.sisiMiring = sisiMiring;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double getLuas() {
        return alas * tinggi;
    }
    
    public double getKeliling() {
        return (alas+sisiMiring)*2;
    }
    
    
}
