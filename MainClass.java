package tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] a) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean next = true;
        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            mahasiswas.add(mahasiswa);

            System.out.print("tambah lagi? (y/n) ");
            String tambah = scanner.nextLine();

            if (!tambah.equalsIgnoreCase("y")) {
                next = false;
            }
        }

        System.out.println("==================================");
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}


