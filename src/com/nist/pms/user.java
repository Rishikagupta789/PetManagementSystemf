package com.nist.pms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rishika Gupta
 */
public class user {
    private byte[] picture;
    
    public user(byte[] image){
        this.picture = image;
    }
    public byte[] getImage(){
        return picture;
    }
}
