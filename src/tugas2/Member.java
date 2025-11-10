package tugas2;

public abstract class Member{
    protected String nomorInduk;
    protected String nama;
    protected String alamat;
    protected String email;
    protected String profesi;

    public String getNomorInduk() {
        return nomorInduk;
    }
    
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getProfesi() {
        return profesi;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }
    

    public void menu(){
        System.out.println("");
    }
    
    public void isiData(){
        System.out.println("Data Kosong");
    }
    
}
