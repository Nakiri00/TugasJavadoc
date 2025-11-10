package tugas2;
import java.util.Scanner;

public class Karyawan extends Member{
    Scanner in = new Scanner(System.in);
    protected String divisi;

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public void isiData(){
        System.out.println("");
        System.out.println("Form Tambah Data Karyawan");
        System.out.println("================================");
        super.setProfesi("Karyawan");
        System.out.print("NIP           : " );super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : ");super.setNama(in.nextLine());
        System.out.print("Alamat        : ");super.setAlamat(in.nextLine());
        System.out.print("email         : ");super.setEmail(in.nextLine());
        System.out.print("Divisi        : ");divisi = in.nextLine();
    }
    
    
    
}
