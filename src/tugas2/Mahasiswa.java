package tugas2;
import java.util.Scanner;
public class Mahasiswa extends Member{
    Scanner in = new Scanner(System.in);
    protected String prodi;

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void isiData(){
        System.out.println("");
        System.out.println("Form Tambah Data Mahasiswa");
        System.out.println("================================");
        super.setProfesi("Mahasiswa");
        System.out.print("NIM           : " );super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : ");super.setNama(in.nextLine());
        System.out.print("Alamat        : ");super.setAlamat(in.nextLine());
        System.out.print("email         : ");super.setEmail(in.nextLine());
        System.out.print("Program Studi : ");prodi = in.nextLine();
    }
}
