package datapenjualanlahan; 
import java.util.Scanner;
public class Transaksi {
    Scanner input = new Scanner (System.in);
    protected String nama;
    protected String alamat;
    protected String pilihan[] = {"", "Lahan Persegi", "Lahan Persegi Panjang"};
    protected int no;
    protected String alamatlahan;
    public void PengisianData(){
        System.out.print("Nama         : ");
        nama = input.nextLine();
        System.out.print("Alamat       : ");
        alamat = input.nextLine();
        System.out.println("-------------------------------");
        for(int a=1; a<pilihan.length; a++){
            System.out.println(a+". "+pilihan[a]);
        }
        boolean a = true;
        while(a){
            System.out.print("Pilihan Tanah Anda : ");
            no = input.nextInt();
            switch (no) {
                case 1:
                    LahanPersegi Persegi = new LahanPersegi();
                    Persegi.getSisi();
                    Luas();
                    System.out.println("Luas Lahan         : "+Persegi.Luas());
                    Keliling();
                    System.out.println("Keliling Lahan     : "+Persegi.Keliling());
                    System.out.println("-------------------------------");
                    Persegi.Harga();
                    System.out.println("-------------------------------");
                    getData();
                    Persegi.getData();
                    a = false;
                    break;
                case 2:
                    LahanPersegiPanjang PersegiPanjang = new LahanPersegiPanjang();
                    PersegiPanjang.getPanjangLebar();
                    Luas();
                    System.out.println("Luas Lahan         : "+PersegiPanjang.Luas());
                    Keliling();
                    System.out.println("Keliling Lahan     : "+PersegiPanjang.Keliling());
                    System.out.println("-------------------------------");
                    PersegiPanjang.Harga();
                    System.out.println("-------------------------------");
                    getData();
                    PersegiPanjang.getData();
                    a = false;
                    break;
                default:
                    System.out.println("-- Tidak Ada Pilihan Tersebut --");
                    a = true;
                    break;
            }
        }
    }
    double Luas(){
        System.out.println("Menghitung Luas Lahan");
        return 0;
    }
    double Keliling(){
        System.out.println("Menghitung Keliling Lahan");
        return 0;
    }
    public void Alamat(String alamat){
        this.alamatlahan = alamat;
        System.out.println("Alamat Lahan : "+alamat);
    }
    public void getData(){
        System.out.println("");
        System.out.println("===============================");
        System.out.println("|       SERTIFIKAT LAHAN       |");
        System.out.println("===============================");
        System.out.println("Nama Pemilik : "+nama);
        System.out.println("Alamat Rumah : "+alamat);
        Alamat("KEBUN PAK BUDI MALANG");
    }
}