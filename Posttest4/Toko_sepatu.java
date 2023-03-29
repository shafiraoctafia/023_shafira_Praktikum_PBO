/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

public class Toko_sepatu {
    //property
    String merek, warna;
    int ukuran, harga  ;
    
    public Toko_sepatu(String merek, String warna, int ukuran, int harga){
    this.merek = merek;
    this.warna = warna;
    this.ukuran = ukuran;
    this.harga = harga;
}

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
    


    
public void terupdate(){
    System.out.println("------------------------------------------" );
    System.out.println("       Data Sepatu Telah Terupdate :)     " );
    System.out.println("------------------------------------------" );
    System.out.println("Merek Sepatu        : " + this.merek);
    System.out.println("Ukuran Sepatu       : " + this.ukuran);
    }
}
    
class kepala{
    public void notif(String macam){
            System.out.println("------------------------------------------" );
            System.out.println("     Tambahkan Data Sepatu" +macam );
            System.out.println("------------------------------------------" );
    }
    public void notif(int pilih){
        if (pilih == 1){

            System.out.println("------------------------------------------" );
            System.out.println("       Data Sepatu Telah Terupdate :)     " );
            System.out.println("------------------------------------------" );
        }else if (pilih==2){
            System.out.println("------------------------------------------" );
            System.out.println("      Data Telah Berhasil Dihapus :)      " );
            System.out.println("------------------------------------------" );
            
        }
    }
}
    

