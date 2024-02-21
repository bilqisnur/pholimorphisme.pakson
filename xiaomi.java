/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class xiaomi implements phone {
    
    private int volume;
    private boolean ispowerOn;
    
    public xiaomi(){
        this.volume = 50;
    }
    
    public void powerOn(){
        ispowerOn = true;
        System.out.println("Handphone menyala....");
        System.out.println("selamat datang di XIAOMI");
        System.out.println("Android version 29");
    }
    
    public void powerOff(){
        ispowerOn = false;
        System.out.println("Handphone dimatkan");
    }
    
    public void volumeUp(){
        if (ispowerOn){
            if(this.volume== Max_volume){
                System.out.println("VOLUME FULL!!");
                System.out.println("sudah"+ this.getvolume() + "%");
            }else {
                this.volume += 10;
                System.out.println("volume sekarang : "+ this.getvolume());
            }
        }else{
            System.out.println("Nyalakan dulu HP-nya !!");
        }
    }
    public void volumeDown(){
        if(ispowerOn){
            if(this.volume == Min_volume){
                System.out.println("Volume = 0%");
            }else {
                this.volume -= 10;
                System.out.println("volume sekarang : " +this.getvolume());
            }
        }else{
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public int getvolume(){
        return this.volume;
    }
}
