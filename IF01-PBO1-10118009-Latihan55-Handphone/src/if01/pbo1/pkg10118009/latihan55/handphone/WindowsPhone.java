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
public class WindowsPhone extends Handphone{
    public String wpKeyStore;
    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
}
