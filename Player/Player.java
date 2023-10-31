/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.player;

/**
 *
 * @author salsa
 */
public class Player {
    private String name, weapon;
    private int health;
    
    public Player(String name, int health, String weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String attack(){
        return name +" is attacking \r\n" +name +" health before " +health;
    }

    public String healing(){
        health += 50;
        return name +" is healing \r\n" +name +" health after healing " +health;
    }

    public String changeWeapon(String newWeapon){
        this.weapon = newWeapon;
        //return newWeapon;
        return "ChangeWeapon(“" +weapon +"”)";
    }
    
    public String displayWeapon() {
        return name + " weapon now is " + weapon;
    }
}
