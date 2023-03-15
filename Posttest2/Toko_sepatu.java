/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

import java.util.*;
import java.io.*;

public class Toko_sepatu {
    //property
    private String merek, warna, jenis;
    private int ukuran, harga  ;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public Toko_sepatu(String merek, String warna, String jenis, int ukuran, int harga){
        this.merek = merek;
        this.warna = warna;
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    
public void terupdate(){
    System.out.println("------------------------------------------" );
    System.out.println("       Data Sepatu Telah Terupdate :)     " );
    System.out.println("------------------------------------------" );
    System.out.println("Merek Sepatu    : " + this.merek);
    System.out.println("Warna Sepatu    : " + this.warna);
    System.out.println("Jenis Sepatu    : " + this.jenis);
    System.out.println("Ukuran Sepatu   : " + this.ukuran);
    System.out.println("Harga Sepatu    : " + this.harga);
    }
}
    
    