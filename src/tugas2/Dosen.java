package tugas2;
import java.util.Scanner;

/**
 * Merepresentasikan seorang Dosen.
 * Kelas ini adalah turunan dari {@link Member} dan mengimplementasikan
 * metode {@link #isiData()} untuk Dosen.
 */
public class Dosen extends Member {
    /**
     * Scanner untuk menerima input dari pengguna.
     */
    Scanner in = new Scanner(System.in);

    /**
     * Menampilkan formulir dan memproses input data spesifik untuk Dosen.
     * Meng-override metode {@link Member#isiData()}.
     */
    public void isiData() {
        System.out.println("");
        System.out.println("Form Tambah Data Dosen");
        System.out.println("================================");
        super.setProfesi("Dosen");
        System.out.print("NIDN          : "); super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : "); super.setNama(in.nextLine());
        System.out.print("Alamat        : "); super.setAlamat(in.nextLine());
        System.out.print("Email         : "); super.setEmail(in.next());
    }
}