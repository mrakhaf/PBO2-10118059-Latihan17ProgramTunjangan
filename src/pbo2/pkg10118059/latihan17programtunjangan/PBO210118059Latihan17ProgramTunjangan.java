/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan17programtunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DeklarasiVariabel
        float tunjangan = 0;
        
        //MembuatScannerBaru
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==========PROGRAM TUNJANGAN=========");
        
        //GajiPokok
        System.out.print("Berapa gaji pokok anda perbulan : Rp. ");
        int gajiPokok = keyboard.nextInt();
        
        //Status
        System.out.print("Status Anda(Menikah/Belum) \t: ");
        String status = keyboard.next();
        
        //LogikaUntukStatus
        if (status.equalsIgnoreCase("menikah")){
            tunjangan = (int)(0.35*gajiPokok);
        } else {
            tunjangan = 0;
        }
        
        //Hasil Perhitungan
        System.out.println();
        System.out.println("=======HASIL PERHITUNGAN GAJI ANDA========");
        System.out.println("Gaji Pokok \t: " + gajiPokok);
        System.out.println("Tunjangan \t: " + tunjangan);
        System.out.println("Total Gaji \t: " + (int)(gajiPokok+tunjangan));
        System.out.println("(Developed by mrakhaf)");
        
        
    }
    
}
