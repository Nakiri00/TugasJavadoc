package tugas2;
import java.util.Scanner;

/**
 * Kelas yang mengelola logika utama aplikasi, termasuk navigasi menu
 * dan proses output pendaftaran anggota.
 */
public class Admin {
    /**
     * Scanner untuk menerima input dari pengguna.
     */
    Scanner in = new Scanner(System.in);
    
    /**
     * Menyimpan pilihan menu utama.
     */
    protected int menu;
    
    /**
     * Menyimpan pilihan sub-menu (jenis member).
     */
    protected int menu2;

    /**
     * Mengambil nilai pilihan menu utama.
     * @return int pilihan menu (1 atau 2).
     */
    public int getMenu() {
        return menu;
    }

    /**
     * Mengambil nilai pilihan sub-menu (jenis member).
     * @return int pilihan jenis member (1, 2, atau 3).
     */
    public int getMenu2() {
        return menu2;
    }

    /**
     * Mengatur nilai pilihan menu utama.
     * @param menu Pilihan menu baru.
     */
    public void setMenu(int menu) {
        this.menu = menu;
    }

    /**
     * Mengatur nilai pilihan sub-menu.
     * @param menu2 Pilihan sub-menu baru.
     */
    public void setMenu2(int menu2) {
        this.menu2 = menu2;
    }
 
    /**
     * Menampilkan menu utama dan sub-menu tambah data anggota.
     * Metode ini menangani input pengguna dan melakukan validasi sederhana.
     */
    public void menu() {
        System.out.println("============================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("============================");
        System.out.println("1) Tambah Member");
        System.out.println("2) Keluar");
        System.out.print("Pilih Menu [1/2] : "); menu = in.nextInt();
        while (menu < 1 || menu > 2) {
            System.out.println("Menu Tidak Tersedia,Ulangi");
            System.out.print("Pilih Menu [1/2] : "); menu = in.nextInt();
        }
        if (menu == 1) {
            System.out.println("============================");
            System.out.println("Form Tambah Data Anggota");
            System.out.println("============================");
            System.out.println("1) Tambah Data Dosen");
            System.out.println("2) Tambah Data Karyawan");
            System.out.println("3) Tambah Data Mahasiswa");
            System.out.print("Pilih Member [1/2/3] : "); menu2 = in.nextInt();
            while (menu2 < 1 || menu2 > 3) {
                System.out.println("Menu Tidak Tersedia,Ulangi");
                System.out.print("Pilih Menu [1/2/3] : "); menu2 = in.nextInt();
            }
        } else {
            System.out.println("");
        }
    }

    /**
     * Memproses dan menampilkan output pendaftaran.
     * Metode ini bersifat polimorfik:
     * 1. Memanggil metode {@link Member#isiData()} dari objek yang diberikan 
     * (bisa Dosen, Karyawan, atau Mahasiswa).
     * 2. Mencetak ringkasan pendaftaran.
     *
     * @param data Objek Member (atau turunannya) yang akan diproses.
     */
    public void output(Member data) {  
        data.isiData();
        System.out.println("=========================================================================================");
        System.out.println(data.nama + " telah Terdaftar Sebagai " + data.profesi + ", Passwordnya adalah : " + data.nomorInduk);
        System.out.println("Email Telah terkirim Ke Alamat : " + data.email);
        System.out.println("=========================================================================================");
    }
}