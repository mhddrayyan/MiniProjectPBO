import java.util.Scanner;

class Mahasiswa {
    // Attribute
    String nama;
    String NIM;
    double nilai;

    // Constructor
    Mahasiswa(String nama, String NIM, double nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.nilai = nilai;
    }

    // Method: menampilkan data
    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + NIM);
        System.out.println("Nilai  : " + nilai);
    }

    // Method: cek kelulusan (if / else)
    void cekKelulusan() {
        if (nilai >= 75) {
            System.out.println("Status : LULUS");
        } else if (nilai >= 60) {
            System.out.println("Status : PERLU REMEDIAL");
        } else {
            System.out.println("Status : TIDAK LULUS");
        }
    }
}

public class MahasiswaUSK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable & data type
        int jumlah = 3;
        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        System.out.println("=== INPUT DATA MAHASISWA ===");

        // Loop untuk input data -> membuat object
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nilai : ");
            double nilai = input.nextDouble();
            input.nextLine(); // bersihkan buffer

            // Membuat object Mahasiswa
            daftar[i] = new Mahasiswa(nama, nim, nilai);
        }

        System.out.println("\n=== DATA MAHASISWA ===");

        // Loop untuk menampilkan data & cek kelulusan
        for (int i = 0; i < daftar.length; i++) {
            System.out.println("\n--- Mahasiswa " + (i + 1) + " ---");
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();
        }

        // Tambahan: hitung rata-rata nilai
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.nilai;
        }
        System.out.println("\nRata-rata nilai: " + (total / jumlah));

        input.close();
    }
}