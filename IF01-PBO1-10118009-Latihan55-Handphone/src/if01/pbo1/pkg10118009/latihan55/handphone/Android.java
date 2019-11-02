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
public class Android extends Handphone{
    public String keyStore;
    public Android(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    
}
