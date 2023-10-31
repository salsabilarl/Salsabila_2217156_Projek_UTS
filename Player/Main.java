/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.player;

/**
 *
 * @author salsa
 */
public class Main {
    public static void main(String[] args) {
        Player newPlayer = new Player("Arthur", 100, "Axe");
        System.out.println(newPlayer.attack());
        System.out.println(newPlayer.healing());
        System.out.println(newPlayer.changeWeapon("Sword"));
        System.out.println(newPlayer.displayWeapon());
    }
}
