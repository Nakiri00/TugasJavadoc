package tugas2;
import java.util.Scanner;

/**
 * Merepresentasikan seorang Karyawan (Staf).
 * Kelas ini adalah turunan dari {@link Member} dan mengimplementasikan
 * metode {@link #isiData()} untuk Karyawan, serta menambahkan
 * properti 'divisi'.
 */
public class Karyawan extends Member {
    /**
     * Scanner untuk menerima input dari pengguna.
     */
    Scanner in = new Scanner(System.in);
    
    /**
     * Menyimpan divisi tempat karyawan bekerja.
     */
    protected String divisi;

    /**
     * Mengambil divisi karyawan.
     * @return String nama divisi.
     */
    public String getDivisi() {
        return divisi;
    }

    /**
     * Mengatur divisi karyawan.
     * @param divisi Nama divisi baru.
     */
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    /**
     * Menampilkan formulir dan memproses input data spesifik untuk Karyawan.
     * Meng-override metode {@link Member#isiData()}.
     */
    public void isiData() {
        System.out.println("");
        System.out.println("Form Tambah Data Karyawan");
        System.out.println("================================");
        super.setProfesi("Karyawan");
        System.out.print("NIP           : "); super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : "); super.setNama(in.nextLine());
        System.out.print("Alamat        : "); super.setAlamat(in.nextLine());
        System.out.print("email         : "); super.setEmail(in.nextLine());
        System.out.print("Divisi        : "); divisi = in.nextLine();
    }
}