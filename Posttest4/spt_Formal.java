/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author user
 */
public class spt_Formal extends Toko_sepatu{

    private String ciri_ciri;

    public spt_Formal(String merek, String warna, String ciri_ciri, int ukuran, int harga) {
        super(merek, warna, ukuran, harga);
        this.ciri_ciri = ciri_ciri;
    }

    public String getCiri_ciri() {
        return ciri_ciri;
    }

    public void setCiri_ciri(String ciri_ciri) {
        this.ciri_ciri = ciri_ciri;
    }
    @Override
    public void terupdate(){
    System.out.println("Merek Sepatu        : " + this.merek);
    System.out.println("Ukuran Sepatu       : " + this.ukuran);
    System.out.println("Ukuran Sepatu       : " + this.ciri_ciri);
    
    }
  




    
    
    
    
}
