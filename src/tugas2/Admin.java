package tugas2;
import java.util.Scanner;

public class Admin{
    Scanner in = new Scanner(System.in);
    protected int menu;
    protected int menu2;

    public int getMenu() {
        return menu;
    }

    public int getMenu2() {
        return menu2;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public void setMenu2(int menu2) {
        this.menu2 = menu2;
    }
 
    public void menu(){
        System.out.println("============================");
        System.out.println("SISTEM INFORMASI AKADEMIK");
        System.out.println("============================");
        System.out.println("1) Tambah Member");
        System.out.println("2) Keluar");
        System.out.print("Pilih Menu [1/2] : ");menu = in.nextInt();
        while(menu < 1 || menu > 2){
            System.out.println("Menu Tidak Tersedia,Ulangi");
            System.out.print("Pilih Menu [1/2] : ");menu = in.nextInt();
        }
            if(menu == 1){
                System.out.println("============================");
                System.out.println("Form Tambah Data Anggota");
                System.out.println("============================");
                System.out.println("1) Tambah Data Dosen");
                System.out.println("2) Tambah Data Karyawan");
                System.out.println("3) Tambah Data Mahasiswa");
                System.out.print("Pilih Member [1/2/3] : ");menu2 = in.nextInt();
                while(menu2 < 1 || menu2 > 3){
                    System.out.println("Menu Tidak Tersedia,Ulangi");
                    System.out.print("Pilih Menu [1/2/3] : ");menu2 = in.nextInt();
                }
            }else{
                System.out.println("");
            }
    }

    public void output(Member data){  
        data.isiData();
        System.out.println("=========================================================================================");
        System.out.println(data.nama +" telah Terdaftar Sebagai " +data.profesi +", Passwordnya adalah : " +data.nomorInduk);
        System.out.println("Email Telah terkirim Ke Alamat : " +data.email);
        System.out.println("=========================================================================================");
    }
}
