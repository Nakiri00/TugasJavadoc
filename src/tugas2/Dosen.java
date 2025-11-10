package tugas2;
import java.util.Scanner;
public class Dosen extends Member{
    Scanner in = new Scanner(System.in);
    public void isiData(){
        System.out.println("");
        System.out.println("Form Tambah Data Dosen");
        System.out.println("================================");
        super.setProfesi("Dosen");
        System.out.print("NIDN          : " );super.setNomorInduk(in.nextLine());
        System.out.print("Nama Lengkap  : ");super.setNama(in.nextLine());
        System.out.print("Alamat        : ");super.setAlamat(in.nextLine());
        System.out.print("Email         : ");super.setEmail(in.next());
    }
}
