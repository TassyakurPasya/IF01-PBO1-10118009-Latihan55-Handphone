/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan55.handphone;

/**
 *
 * @author LENOVO
 */
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    public Handphone(String manufacture, String operatingSystem, String model, int harga){
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model=model;
        this.harga=harga;
    }
    public void displayProduct(){
        System.out.println("Manufacture : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}
