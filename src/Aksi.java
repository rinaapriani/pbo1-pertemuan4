import model.Mahasiswa;

import java.util.Scanner;

public class Aksi {
    public static void main(String[] args) {

        //instance/pembuatan object dari sebuah class
        //NamaClass namaObject = new Constructor();
        Mahasiswa fulan = new Mahasiswa();
        fulan.npm = "19630001";
        fulan.nama = "Fulan bin Fulan";
        fulan.jumlahSKS = 100;
        fulan.ipk = 3.11;

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

        Scanner inputan = new Scanner(System.in);
        fulan.nama = inputan.nextLine();
    }
}
