/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

import java.util.*;
import java.io.*;

public class Main {
   static ArrayList<Posttest2.Toko_sepatu>toko_sepatu = new ArrayList<Posttest2.Toko_sepatu>();
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
public static void main(String[] args) throws IOException {
    while (true) {
        System.out.println("========================================== ");
        System.out.println("                                           ");
        System.out.println("             P E N D A T A A N             ");
        System.out.println("            T O K O  S E P A T U           ");
        System.out.println("                                           ");
        System.out.println("========================================== ");
        System.out.println("       1. Menambahkan Data Sepatu          ");
        System.out.println("       2. Melihat Data Sepatu              ");
        System.out.println("       3. Mengedit Data Sepatu             ");
        System.out.println("       4. Menghapus Data Sepatu            ");
        System.out.println("       5. Exit                             ");
        System.out.println("========================================== ");
        System.out.print("Masukkan Pilihan  : ");
        
        int pilihan = Integer.parseInt(br.readLine());
        switch(pilihan){
            case 1:
                createSPT();
                break;
            case 2:
                readSPT();
                break;
            case 3:
                updateSPT();
                break;
            case 4:
                deleteSPT();
                break;
            case 5:
                System.out.println("------------------------------------------" );
                System.out.println(" Terimakasih Telah Menggunakan Program Ini" );
                System.out.println("                   :)                     " );
                System.out.println("------------------------------------------" );
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia :(");
                break;  
       }
    }
}

public static void createSPT()throws IOException{
    System.out.print("Masukan Merek Sepatu  : ");
    String addmerek = br.readLine();
    System.out.print("Masukan warna Sepatu  : ");
    String addwarna = br.readLine();
    System.out.print("Masukan jenis Sepatu  : ");
    String addjenis = br.readLine();
    System.out.print("Masukan Size  Sepatu  : ");
    int addukuran = Integer.parseInt (br.readLine());
    System.out.print("Masukan Harga Sepatu  : ");
    int addharga = Integer.parseInt (br.readLine());
    Posttest2.Toko_sepatu TKspt = new Posttest2.Toko_sepatu(addmerek, addwarna, addjenis, addukuran, addharga);
    toko_sepatu.add(TKspt);
    System.out.println("                                     ");
    System.out.println("------------------------------------------" );
    System.out.println("     Data Telah Berhasil Ditambahkan :)   " );
    System.out.println("------------------------------------------" );
}


public static void readSPT() throws IOException{
    if (toko_sepatu.isEmpty()){
            System.out.println("------------------------------------------" );
            System.out.println("            Data Sepatu Kosong            " );
            System.out.println("------------------------------------------" );
            System.out.println(" ");
        } else{
            System.out.println("------------------------------------------" );
            System.out.println("              Lihat Data Sepatu           " );
            System.out.println("------------------------------------------" );
            for (int i = 0; i <toko_sepatu.size(); i++){
                System.out.println("Data Sepatu ke-" + (i+1));
                System.out.println("Merek Sepatu    : " + toko_sepatu.get(i).getMerek());
                System.out.println("Warna Sepatu    : " + toko_sepatu.get(i).getWarna());
                System.out.println("Jenis Sepatu    : " + toko_sepatu.get(i).getJenis());
                System.out.println("Size Sepatu     : " + toko_sepatu.get(i).getUkuran());
                System.out.println("Harga Sepatu    : " + toko_sepatu.get(i).getHarga());
                System.out.println("                                     ");
            }
    }
}


public static void updateSPT() throws IOException{
    readSPT();

    System.out.println("------------------------------------------" );
    System.out.println("            Update Data Sepatu            " );
    System.out.println("------------------------------------------" );
    System.out.print("Masukan Data Sepatu ke-");
    int index = Integer.parseInt(br.readLine());
    System.out.print("Masukan Merek Sepatu  : ");
    String setmerk = br.readLine();
    System.out.print("Masukan Warna Sepatu  : ");
    String setwarna = br.readLine();
    System.out.print("Masukan Jenis Sepatu  : ");
    String setjenis = br.readLine();
    System.out.print("Masukan Size Sepatu   : ");
    int setukuran = Integer.parseInt(br.readLine());
    System.out.print("Masukan Harga Sepatu  : ");
    int setharga = Integer.parseInt(br.readLine());
    
    toko_sepatu.get(index-1).setMerek(setmerk);
    toko_sepatu.get(index-1).setWarna(setwarna);
    toko_sepatu.get(index-1).setJenis(setjenis);
    toko_sepatu.get(index-1).setUkuran(setukuran);
    toko_sepatu.get(index-1).setHarga(setharga);
    
    toko_sepatu.get(index-1).terupdate();
    
}


public static void deleteSPT() throws IOException{
    readSPT();
    System.out.println("------------------------------------------" );
    System.out.println("             Delete Data Sepatu           " );
    System.out.println("------------------------------------------" );
    System.out.print("Masukan Data Sepatu Ke-");
    int index = Integer.parseInt(br.readLine());
    System.out.println("------------------------------------------" );
    System.out.println("      Data Telah Berhasil Dihapus :)      " );
    System.out.println("------------------------------------------" );

    toko_sepatu.remove(index-1);
    }
}



