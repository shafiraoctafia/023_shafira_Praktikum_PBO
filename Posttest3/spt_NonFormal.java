/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

/**
 *
 * @author user
 */
public class spt_NonFormal extends Toko_sepatu{

    private String jenis;

    public spt_NonFormal(String merek, String warna, String jenis, int ukuran, int harga) {
        super(merek, warna, ukuran, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    
}
