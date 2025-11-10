package tugas2;

/**
 * Kelas abstract (abstrak) dasar yang merepresentasikan seorang anggota
 * di sistem akademik.
 * Kelas ini berisi informasi umum seperti nama, alamat, dan profesi.
 *
 * @author Hilman Fauzi
 * @version 1.0
 */
public abstract class Member {
    protected String nomorInduk;
    protected String nama;
    protected String alamat;
    protected String email;
    protected String profesi;

    /**
     * Mengambil nomor induk anggota (NIM, NIDN, NIP).
     * @return String nomor induk.
     */
    public String getNomorInduk() {
        return nomorInduk;
    }

    /**
     * Mengambil nama lengkap anggota.
     * @return String nama lengkap.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil alamat tinggal anggota.
     * @return String alamat.
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mengambil alamat email anggota.
     * @return String email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengambil profesi anggota (Dosen, Mahasiswa, Karyawan).
     * @return String profesi.
     */
    public String getProfesi() {
        return profesi;
    }

    /**
     * Mengatur nomor induk anggota.
     * @param nomorInduk Nomor induk baru.
     */
    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    /**
     * Mengatur nama lengkap anggota.
     * @param nama Nama lengkap baru.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengatur alamat tinggal anggota.
     * @param alamat Alamat baru.
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Mengatur alamat email anggota.
     * @param email Email baru.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mengatur profesi anggota.
     * @param profesi Profesi baru.
     */
    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }

    /**
     * Metode placeholder untuk menu. Saat ini tidak memiliki implementasi.
     */
    public void menu() {
        System.out.println("");
    }

    /**
     * Metode abstract placeholder untuk pengisian data.
     * Kelas turunan (subclass) harus meng-override metode ini
     * untuk menyediakan formulir input data yang spesifik.
     */
    public void isiData() {
        System.out.println("Data Kosong");
    }
}