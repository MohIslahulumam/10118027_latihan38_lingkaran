/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118027_if.pkg1_latihan38_lingkaran;

/**
 *
 * @author RYZEN
 */
public class Main {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lingkaran bulat = new Lingkaran();
       
        System.out.println("======Perhitungan Lingkaran======");
        bulat.validasi();
        bulat.tampil(bulat.diameter);
    }

}
