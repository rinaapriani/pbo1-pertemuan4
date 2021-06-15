import model.Mahasiswa;

import java.util.Scanner;

public class Aksi {
    public static void main(String[] args) {

        //instance/pembuatan object dari sebuah class
        //NamaClass namaObject = new Constructor();
        //constructor menggunakan method
        //constructor tidak punya return values dan tidak punya void
        //constructor sama dengan nama Class
        //constructor berjakan ketika object dibuat(di-instace)
        Mahasiswa fulan = new Mahasiswa();
        fulan.npm = "19630001";
        fulan.nama = "Fulan bin Fulan";
        fulan.jumlahSKS = 100;
        fulan.ipk = 3.11;
        fulan.setKota("Banjarbaru");

        fulan.tampilkanInfo();
        fulan.create();

        Mahasiswa mahasiswa =  new Mahasiswa();
        mahasiswa.npm = "19630002";
        mahasiswa.nama = "Fulanah binti Fulan";

        mahasiswa.tampilkanInfo();
        if (fulan.create()){
            System.out.println("Data berhasil disimpan");
        }else{
            System.out.println("Data gagal disimpan");
        }

        Mahasiswa m = new Mahasiswa();
        m.tampilkanInfo();


    }
}
