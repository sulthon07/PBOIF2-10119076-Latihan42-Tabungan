/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Tabungan
 */
public class PBOIF210119076Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int saldoAwal,jumlahUang;
        
        System.out.println("=====Program Penarikkan Uang=====");
        System.out.print("Masukkan Saaldo Awal : ");
        saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        System.out.print("Jumlah uang yang diambil : ");
        jumlahUang = scanner.nextInt();
        System.out.println("Saldo anda sekarang : " + tabungan.ambilUang(jumlahUang));
    }
    
}
