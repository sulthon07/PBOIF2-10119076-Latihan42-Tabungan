/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan42.tabungan;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Tabungan
 */
public class Tabungan {
    int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
