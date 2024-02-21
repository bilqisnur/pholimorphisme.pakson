/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class phoneUser {
    private phone phone;
    
    public phoneUser(phone phone){
        this.phone = phone;
    }
    
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    
    void turnOffThePhone(){
        this.phone.powerOff();
        
    }
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
    
}
