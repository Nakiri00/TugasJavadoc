package tugas2;

/**
 * Kelas utama (entry point) untuk menjalankan aplikasi Sistem Informasi Akademik.
 * Kelas ini berisi method {@code main} yang mengontrol alur program.
 */
public class Main {

    /**
     * Method main untuk memulai eksekusi program.
     * Membuat instance Admin dan menjalankan loop menu sampai pengguna
     * memilih untuk keluar.
     *
     * @param args Argumen baris perintah (command-line arguments), tidak digunakan.
     */
    public static void main(String[] args) {
        Admin out = new Admin();
        out.menu();
        while (out.getMenu() != 2) {
            if (out.getMenu2() == 1) {
                out.output(new Dosen());
            } else if (out.getMenu2() == 2) {
                out.output(new Karyawan());
            } else {
                out.output(new Mahasiswa());
            }
            out.menu();
        }
    }
}