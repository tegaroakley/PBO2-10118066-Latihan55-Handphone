/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan55.handphone;

/**
 *
 * @author PC
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur \t\t: " + manufacture);
        System.out.println("OS \t\t\t: " + operatingSystem);
        System.out.println("Model \t\t\t: " + model);
        System.out.println("Harga \t\t\t: " + harga);
    }
}
