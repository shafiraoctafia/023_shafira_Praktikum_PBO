/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin implements lvadmin{
   static ArrayList<Admin>admin = new ArrayList<>();
   static ArrayList<lvadmin>LVADMIND = new ArrayList<>();
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   private String username, password, nama;
   private String notelpon;

    public Admin(String username, String password, String nama, String notelpon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.notelpon = notelpon;
    }

    public static ArrayList<Admin> getAdmin() {
        return admin;
    }

    public static void setAdmin(ArrayList<Admin> admin) {
        Admin.admin = admin;
    }

    public static ArrayList<lvadmin> getLVADMIND() {
        return LVADMIND;
    }

    public static void setLVADMIND(ArrayList<lvadmin> LVADMIND) {
        Admin.LVADMIND = LVADMIND;
    }

    public static BufferedReader getBr() {
        return br;
    }

    public static void setBr(BufferedReader br) {
        Admin.br = br;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelpon() {
        return notelpon;
    }

    public void setNotelpon(String notelpon) {
        this.notelpon = notelpon;
    }



    @Override
    public void menu() throws IOException {
        System.out.println("========================================== ");
        System.out.println("                                           ");
        System.out.println("                  M E N U                  ");
        System.out.println("            D A T A   A D M I N            ");
        System.out.println("                                           ");
        System.out.println("========================================== ");
        System.out.println("       1. Tambah Data Admin                ");
        System.out.println("       2. Melihat Data Admin               ");
        System.out.println("       3. Menghapus Data Admin             ");
        System.out.println("       4. Exit                             ");
        System.out.println("========================================== ");
        System.out.print("Masukkan Pilihan  : ");
        
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1 :
                tambahData();
                break;
            case 2 :
                bacaData();
                break;
            case 3 :
                deleteData();
                break;
            case 4 :
                System.exit(0);
                break;
        }
    }

    @Override
    public void tambahData() throws IOException {
        System.out.print("Masukan Username  : ");
        String addusername = br.readLine();
        System.out.print("Masukan Password  : ");
        String addpassword = br.readLine();
        System.out.print("Masukan Nama      : ");
        String addnama = br.readLine();
        System.out.print("Masukan No.Telpon : ");
        String addnotelpon = br.readLine();
        Admin admn = new Admin(addusername, addpassword, addnama, addnotelpon);
        admin.add(admn);
        System.out.println("                                     ");
        System.out.println("------------------------------------------" );
        System.out.println("     Data Telah Berhasil Ditambahkan :)   " );
        System.out.println("------------------------------------------" );
}
        
    

    @Override
    public void bacaData() throws IOException {
        if (admin.isEmpty()){
            System.out.println("------------------------------------------" );
            System.out.println("            Data Admin Kosong             " );
            System.out.println("------------------------------------------" );
            System.out.println(" ");
        } else{
            System.out.println("------------------------------------------" );
            System.out.println("              Lihat Data Admin            " );
            System.out.println("------------------------------------------" );
            for (int i = 0; i < admin.size(); i++){
                System.out.println("Data Admin ke-" + (i+1));
                System.out.println("Username    : " + admin.get(i).username);
                System.out.println("Password    : " + admin.get(i).password);
                System.out.println("Nama        : " + admin.get(i).nama);
                System.out.println("NoTelpon    : " + admin.get(i).notelpon);
                System.out.println("                                     ");
            }
         }
    
    }
    
    @Override
    public void deleteData() throws IOException {
        bacaData();
        System.out.println("------------------------------------------" );
        System.out.println("             Delete Data Admin            " );
        System.out.println("------------------------------------------" );
        System.out.print("Masukan Data Admin Ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.println("------------------------------------------" );
        System.out.println("      Data Telah Berhasil Dihapus :)      " );
        System.out.println("------------------------------------------" );

        admin.remove(index-1);
    }
    


}    
