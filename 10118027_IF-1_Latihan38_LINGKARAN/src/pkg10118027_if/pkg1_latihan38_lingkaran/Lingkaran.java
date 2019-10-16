/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118027_if.pkg1_latihan38_lingkaran;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author RYZEN
  */
public class Lingkaran {

    public double diameter;
    public double jariJari;

    Scanner masuk = new Scanner(System.in);

    public void validasi() {
        String dmt;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            dmt = masuk.nextLine();
            System.out.println((!dmt.matches("[0-9]*")) ? "Nilai Diameter Tidak Sesuai" : "");
        } while (!dmt.matches("[0-9]*"));
        diameter = Double.parseDouble(dmt);
    }

    public double hitungJariJari(double parDiameter) {
        return parDiameter / 2;
    }

    public double luasLingkaran(double parJariJari) {
        return Math.PI * parJariJari * parJariJari;
    }

    public double kelilingLingkaran(double parJariJari) {
        return 2 * Math.PI * parJariJari;
    }

    public void tampil(double parDiameter) {
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-Jari Lingkaran: %.2f", hitungJariJari(parDiameter));
        System.out.printf("%nLuas Lingkaran: %.2f", luasLingkaran(hitungJariJari(parDiameter)));
        PrintStream PrintStream = System.out.printf("%nKeliling Lingkaran: %.2f%n", kelilingLingkaran(hitungJariJari(parDiameter))); /*printf*/
    }
}
