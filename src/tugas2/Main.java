package tugas2;

public class Main {

    public static void main(String[] args) {
        Admin out = new Admin();
        out.menu();
        while(out.getMenu()!= 2){
            if(out.getMenu2() == 1){
                out.output(new Dosen());
            }else if(out.getMenu2() == 2){
                out.output(new Karyawan());
            }else{
                out.output(new Mahasiswa());
            }
            out.menu();
    
        }
    }
}