package KartuPelajar;
public class Main {
    public static void main(String[] args) {
        //membuat object
        PengisianData output = new PengisianData();
        //memanggil method isiData dari class PengisianData
        output.isiData();
        //hasil output akhir
        System.out.println("|              KARTU PELAJAR               |");
        System.out.println("============================================");
        System.out.println("Nama Lengkap         : "+output.nama);
        System.out.println("NISN                 : "+output.nisn);
        System.out.println("Tempat Tanggal Lahir : "+output.tempat+", "+output.tgl+"/"+output.bln+"/"+output.thn);
        System.out.println("Jenis Kelamin        : "+output.gender);
        System.out.println("Alamat Lengkap       : "+output.alamat+", RT "+output.rt+", RW "+output.rw);
        System.out.println("                       "+output.kel+", "+output.kec+", "+output.kota);
    }
}