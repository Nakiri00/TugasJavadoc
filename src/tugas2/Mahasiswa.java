package tugas2;
import java.util.Scanner;

/**
 * Merepresentasikan seorang Mahasiswa.
 * Kelas ini adalah turunan dari {@link Member} dan mengimplementasikan
 * metode {@link #isiData()} untuk Mahasiswa, serta menambahkan
 * properti 'prodi' (Program Studi).
 */
public class Mahasiswa extends Member {
    /**
     * Scanner untuk menerima input dari pengguna.
     */
    Scanner in = new Scanner(System.in);
    
    /**
     * Menyimpan program studi mahasiswa.
     */
    protected String prodi;

    /**
     * Mengambil program studi mahasiswa.
     * @return String nama program studi.
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * Mengatur program studi mahasiswa.
     * @param prodi Nama program studi baru.
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    /**
     * Menampilkan formulir dan memproses input data spesifik untuk Mahasiswa.
     * Meng-override metode {@link Member#isiData()}.
     */
    public void isiData() {
        System.out.println("");
        System.out.println("Form Tambah Data Mahasiswa");
        System.out.println("================================");
        super.setProfesi("Mahasiswa");
        System.out.print("NIM           : "); super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : "); super.setNama(in.nextLine());
        System.out.print("Alamat        : "); super.setAlamat(in.nextLine());
        System.out.print("email         : "); super.setEmail(in.nextLine());
        System.out.print("Program Studi : "); prodi = in.nextLine();
    }
}