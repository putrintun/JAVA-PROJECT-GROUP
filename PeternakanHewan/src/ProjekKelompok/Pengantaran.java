package ProjekKelompok;
import java.util.Scanner;
public class Pengantaran {
    Scanner input = new Scanner(System.in);
    String nama, alamat, kec, kel;
    int rt, rw, tanggal, bulan, tahun;
    void IsiData(){
        System.out.println("=========================================");
        System.out.print("Masukkan Nama Anda            : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda          : ");
        alamat = input.nextLine();
        System.out.print("                    Kecamatan : ");
        kec = input.nextLine();
        System.out.print("                    Kelurahan : ");
        kel = input.nextLine();
        System.out.print("                    RT        : ");
        rt = input.nextInt();
        System.out.print("                    RW        : ");
        rw = input.nextInt();
        System.out.print("Waktu Pengantaran : Tanggal   : ");
        tanggal = input.nextInt();
        System.out.print("                    Bulan     : ");
        bulan = input.nextInt();
        System.out.print("                    Tahun     : ");
        tahun = input.nextInt();
    }
    void penampilan(){
        System.out.println("Nama Pembeli      : "+nama);
        System.out.println("Alamat            : "+alamat+", Kelurahan "+kel+",");
        System.out.println("                    Kecamatan "+kec+", RT "+rt+", RW "+rw);
        System.out.println("Waktu Pengantaran : "+tanggal+"/"+bulan+"/"+tahun);
    }
}