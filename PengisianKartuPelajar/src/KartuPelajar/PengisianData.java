package KartuPelajar;
import java.util.Scanner;
public class PengisianData extends Data{
    //membuat Scanner
    Scanner input = new Scanner(System.in);
    //membuat method isiData
    public void isiData(){
        //membuat judul
        System.out.println("|              PENGISIAN DATA              |");
        System.out.println("============================================");
        System.out.println("DATA UMUM ----------------------------------");
        //meminta masukan dari user untuk variabel nama
        System.out.print("Masukkan Nama Anda          : ");
        nama = input.nextLine();
        //meminta masukan dari user untuk variabel gender
        System.out.print("Masukkan Jenis Kelamin Anda : ");
        gender = input.nextLine();
        //meminta masukan dari user untuk variabel nisn
        System.out.print("Masukkan NISN Anda          : ");
        nisn = input.nextInt();
        System.out.println("DATA LAHIR ---------------------------------");
        //meminta masukan dari user untuk variabel tempat
        System.out.print("Masukkan Tempat Lahir Anda  : ");
        tempat = input.nextLine();
        //meminta masukan dari user untuk variabel tanggal
        System.out.print("Masukkan Tanggal Lahir Anda : ");
        tgl = input.nextInt();
        //meminta masukan dari user untuk variabel bulan
        System.out.print("Masukkan Bulan Lahir Anda   : ");
        bln = input.nextInt();
        //meminta masukan dari user untuk variabel tahun
        System.out.print("Masukkan Tahun Lahir Anda   : ");
        thn = input.nextInt();
        System.out.println("DATA ALAMAT --------------------------------");
        //meminta masukan dari user untuk variabel alamat
        System.out.print("Masukkan Jalan Alamat Anda  : ");
        alamat = input.nextLine();
        //meminta masukan dari user untuk variabel kota
        System.out.print("                       Kota : ");
        kota = input.nextLine();
        //meminta masukan dari user untuk variabel kec
        System.out.print("                  Kecamatan : ");
        kec = input.nextLine();
        //meminta masukan dari user untuk variabel kel
        System.out.print("                  Kelurahan : ");
        kel = input.nextLine();
        //meminta masukan dari user untuk variabel rt
        System.out.print("                         RT : ");
        rt = input.nextInt();
        //meminta masukan dari user untuk variabel rw
        System.out.print("                         RW : ");
        rw = input.nextInt();
    }
    @Override
    String getNama(){
        return nama;
    }
    @Override
    int getNISN(){
        return nisn;
    }
    @Override
    String getTempat(){
        return tempat;
    }
    @Override
    int getTgl(){
        return tgl;
    }
    @Override
    int getBln(){
        return bln;
    }
    @Override
    int getThn(){
        return thn;
    }
    @Override
    String getGender(){
        return gender;
    }
    @Override
    String getAlamat(){
        return alamat;
    }
    @Override
    String getKec(){
        return kec;
    }
    @Override
    String getKel(){
        return kel;
    }
    @Override
    int getRT(){
        return rt;
    }
    @Override
    int getRW(){
        return rw;
    }
    @Override
    String getKota(){
        return kota;
    }
}