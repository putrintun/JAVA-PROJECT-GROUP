package KartuPelajar;
public class Data {
    //membuat variabel instance
    String nama = "Intan Putri Setyowati";
    int nisn = 1234567890;
    String tempat = "Malang";
    int tgl = 22;
    int bln = 03;
    int thn = 2005;
    String gender = "perempuan";
    String alamat = "Jl. Lembayung VII";
    String kec = "Kedungkandang";
    String kel = "Bumiayu";
    int rt = 002;
    int rw = 003;
    String kota = "Malang";
    //membuat method getNama untuk menampilkan nama
    String getNama(){
        return nama;
    }
    //membuat method getNISN untuk menampilkan nisn
    int getNISN(){
        return nisn;
    }
    //membuat method getTempat untuk menampilkan tempat
    String getTempat(){
        return tempat;
    }
    //membuat method getTgl untuk menampilkan tanggal
    int getTgl(){
        return tgl;
    }
    //membuat method getBln untuk menampilkan bulan
    int getBln(){
        return bln;
    }
    //membuat method getThn untuk menampilkan tahun
    int getThn(){
        return thn;
    }
    //membuat method getGender untuk menampilkan jenis kelamin
    String getGender(){
        return gender;
    }
    //membuat method getAlamat untuk menampilkan alamat
    String getAlamat(){
        return alamat;
    }
    //membuat method getKec untuk menampilkan kecamatan
    String getKec(){
        return kec;
    }
    //membuat method getKel untuk menampilkan kelurahan
    String getKel(){
        return kel;
    }
    //membuat method getRT untuk menampilkan rt
    int getRT(){
        return rt;
    }
    //membuat method getRW untuk menampilkan rw
    int getRW(){
        return rw;
    }
    //membuat method getKota untuk menampilkan kota
    String getKota(){
        return kota;
    }
}