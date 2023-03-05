/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Posttest1;

import java.util.*;
import java.io.*;

public class Toko_sepatu {
    //property
    String merek, warna, jenis;
    int ukuran, harga;
    
    public Toko_sepatu(String merek, String warna, String jenis, int harga, int ukuran){
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
    
    