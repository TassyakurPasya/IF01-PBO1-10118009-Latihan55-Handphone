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
public class Blackberry extends Handphone{
    private String pinBB;
    public Blackberry(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
