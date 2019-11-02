/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan55.handphone;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = 
 * @author LENOVO
 */
public class IF01PBO110118009Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        Blackberry bb = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "win8", "Lumia", 1000000);
        
        android.setKeyStore("234ibfd3840fo");
        bb.setPinBB("BHS29");
        wp.setWpKeyStore("UUUQIJWORJ");
        
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        
        bb.displayProduct();
        System.out.println("PIN  : "+bb.getPinBB());
        System.out.println("");
        
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        System.out.println("");
    }
    
}
