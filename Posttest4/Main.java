/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
   static ArrayList<spt_NonFormal>nonFormal = new ArrayList<>();
   static ArrayList<spt_Formal>Formal = new ArrayList<>();
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static kepala kpla = new kepala();
   
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
        
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1 -> tambahSPT();
            case 2 -> bacaSPT();
            case 3 -> updateSPT();
            case 4 -> deleteSPT();
            case 5 -> {
                System.out.println("------------------------------------------" );
                System.out.println(" Terimakasih Telah Menggunakan Program Ini" );
                System.out.println("                   :)                     " );
                System.out.println("------------------------------------------" );
                System.exit(0);
            }
            default -> System.out.println("Pilihan Tidak Tersedia :(");  
       }
    }
}

public static void tambahSPT()throws IOException{
    System.out.println("========================================== ");
    System.out.println("          Tambahkan Data Sepatu            ");
    System.out.println("========================================== ");
    System.out.println("          1. Sepatu Formal                 ");
    System.out.println("          2. Sepatu Non Formal             ");
    System.out.println("========================================== ");
    System.out.print("Masukkan Pilihan  : ");
    int pilih = Integer.parseInt(br.readLine());
    switch (pilih) {
        case 1 -> {
            System.out.println("------------------------------------------" );
            System.out.println("      Tambahkan Data Sepatu Formal        " );
            System.out.println("------------------------------------------" );
            System.out.print("Masukan Merek Sepatu      : ");
            String addmerek = br.readLine();
            System.out.print("Masukan warna Sepatu      : ");
            String addwarna = br.readLine();
            System.out.print("Masukan Ciri-Ciri Sepatu  : ");
            String addciri_ciri = br.readLine();
            System.out.print("Masukan Size  Sepatu      : ");
            int addukuran = Integer.parseInt (br.readLine());
            System.out.print("Masukan Harga Sepatu      : ");
            int addharga = Integer.parseInt (br.readLine());
            Posttest4.spt_Formal sptFormal = new Posttest4.spt_Formal(addmerek, addwarna, addciri_ciri, addukuran, addharga);
            Formal.add(sptFormal);
           }
         
        case 2 -> {

            System.out.print("Masukan Merek Sepatu  : ");
            String addmerek1 = br.readLine();
            System.out.print("Masukan warna Sepatu  : ");
            String addwarna1 = br.readLine();
            System.out.print("Masukan Jenis Sepatu  : ");
            String addjenis = br.readLine();
            System.out.print("Masukan Size  Sepatu  : ");
            int addukuran1 = Integer.parseInt (br.readLine());
            System.out.print("Masukan Harga Sepatu  : ");
            int addharga1 = Integer.parseInt (br.readLine());
            Posttest4.spt_NonFormal sptNonFormal = new Posttest4.spt_NonFormal(addmerek1, addwarna1, addjenis, addukuran1, addharga1);
            nonFormal.add(sptNonFormal);
           }
    }
    
}


public static void bacaSPT() throws IOException{
    System.out.println("========================================== ");
    System.out.println("              Lihat Data Sepatu            ");
    System.out.println("========================================== ");
    System.out.println("             1. Sepatu Formal              ");
    System.out.println("             2. Sepatu Non Formal          ");
    System.out.println("========================================== ");
    System.out.print("Masukkan Pilihan  : ");
    int pilih = Integer.parseInt(br.readLine());
    switch (pilih){
        case 1 -> {
            System.out.println("------------------------------------------" );
            System.out.println("         Lihat Data Sepatu Formal         " );
            System.out.println("------------------------------------------" );
            for (int i = 0; i <Formal.size(); i++){
                System.out.println("Data Sepatu ke-" + (i+1));
                System.out.println("Merek Sepatu        : " + Formal.get(i).getMerek());
                System.out.println("Warna Sepatu        : " + Formal.get(i).getWarna());
                System.out.println("Ciri-ciri Sepatu    : " + Formal.get(i).getCiri_ciri());
                System.out.println("Size Sepatu         : " + Formal.get(i).getUkuran());
                System.out.println("Harga Sepatu        : " + Formal.get(i).getHarga());
                System.out.println("                                     ");
                
            }  }
        
        case 2 -> {
            System.out.println("------------------------------------------" );
            System.out.println("       Lihat Data Sepatu NonFormal        " );
            System.out.println("------------------------------------------" );
            for (int i = 0; i <nonFormal.size(); i++){
                System.out.println("Data Sepatu ke-" + (i+1));
                System.out.println("Merek Sepatu        : " + nonFormal.get(i).getMerek());
                System.out.println("Warna Sepatu        : " + nonFormal.get(i).getWarna());
                System.out.println("Jenis Sepatu        : " + nonFormal.get(i).getJenis());
                System.out.println("Size Sepatu         : " + nonFormal.get(i).getUkuran());
                System.out.println("Harga Sepatu        : " + nonFormal.get(i).getHarga());
                System.out.println("                                     ");
            }  }
        default -> {
            System.out.println("------------------------------------------" );
            System.out.println("            Data Sepatu Kosong            " );
            System.out.println("------------------------------------------" );
            System.out.println(" ");
           }
    }
}


public static void updateSPT() throws IOException{
    System.out.println("========================================== ");
    System.out.println("             Update Data Sepatu            ");
    System.out.println("========================================== ");
    System.out.println("             1. Sepatu Formal              ");
    System.out.println("             2. Sepatu Non Formal          ");
    System.out.println("========================================== ");
    System.out.print("Masukkan Pilihan  : ");
    int pilih = Integer.parseInt(br.readLine());
    switch (pilih){
        case 1 -> {
            System.out.println("------------------------------------------" );
            System.out.println("        Update Data Sepatu Formal         " );
            System.out.println("------------------------------------------" );
            System.out.print("Masukan Data Sepatu ke-");
            int index = Integer.parseInt(br.readLine());
            System.out.print("Masukan Merek Sepatu      : ");
            String setmerk = br.readLine();
            System.out.print("Masukan Warna Sepatu      : ");
            String setwarna = br.readLine();
            System.out.print("Masukan Ciri-ciri Sepatu  : ");
            String setciri_ciri = br.readLine();
            System.out.print("Masukan Size Sepatu       : ");
            int setukuran = Integer.parseInt(br.readLine());
            System.out.print("Masukan Harga Sepatu      : ");
            int setharga = Integer.parseInt(br.readLine());

            Formal.get(index-1).setMerek(setmerk);
            Formal.get(index-1).setWarna(setwarna);
            Formal.get(index-1).setCiri_ciri(setciri_ciri);
            Formal.get(index-1).setUkuran(setukuran);
            Formal.get(index-1).setHarga(setharga);
            
            Formal.get(index-1).terupdate();
            kpla.notif(1);
           }
        
        case 2 -> {
            System.out.println("------------------------------------------" );
            System.out.println("       Update Data Sepatu NonFormal       " );
            System.out.println("------------------------------------------" );
            System.out.print("Masukan Data Sepatu ke-");
            int index = Integer.parseInt(br.readLine());
            System.out.print("Masukan Merek Sepatu      : ");
            String setmerk = br.readLine();
            System.out.print("Masukan Warna Sepatu      : ");
            String setwarna = br.readLine();
            System.out.print("Masukan Jenis Sepatu      : ");
            String setjenis = br.readLine();
            System.out.print("Masukan Size Sepatu       : ");
            int setukuran = Integer.parseInt(br.readLine());
            System.out.print("Masukan Harga Sepatu      : ");
            int setharga = Integer.parseInt(br.readLine());

            nonFormal.get(index-1).setMerek(setmerk);
            nonFormal.get(index-1).setWarna(setwarna);
            nonFormal.get(index-1).setJenis(setjenis);
            nonFormal.get(index-1).setUkuran(setukuran);
            nonFormal.get(index-1).setHarga(setharga);

            nonFormal.get(index-1).terupdate();
        }
    }
}


public static void deleteSPT() throws IOException{
    System.out.println("========================================== ");
    System.out.println("             Delete Data Sepatu            ");
    System.out.println("========================================== ");
    System.out.println("             1. Sepatu Formal              ");
    System.out.println("             2. Sepatu Non Formal          ");
    System.out.println("========================================== ");
    System.out.print("Masukkan Pilihan  : ");
    int pilih = Integer.parseInt(br.readLine());
    switch (pilih) {
        case 1 -> {
            System.out.println("------------------------------------------" );
            System.out.println("             Delete Data Sepatu           " );
            System.out.println("------------------------------------------" );
            System.out.print("Masukan Data Sepatu Ke-");
            int index = Integer.parseInt(br.readLine());
            Formal.remove(index-1);
            kpla.notif(2);
           }
        case 2 -> {
            System.out.println("------------------------------------------" );
            System.out.println("             Delete Data Sepatu           " );
            System.out.println("------------------------------------------" );
            System.out.print("Masukan Data Sepatu Ke-");
            int index = Integer.parseInt(br.readLine());
            nonFormal.remove(index-1);
        }
        default -> System.out.println("Pilihan Tidak Tersedia :(");
    }
    }
}



