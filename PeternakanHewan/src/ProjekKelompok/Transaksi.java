package ProjekKelompok;
import java.util.Scanner;
public class Transaksi {
    int pilihan, bayar, jumlah, kurang, kembali;
    String pilihjenis, jawaban;
    Scanner input = new Scanner(System.in);
    String[] jenis = {" ","AYAM","SAPI","KAMBING","BEBEK"};
    int[] harga = {0, 100000, 30000000, 5000000, 100000};
    int daftarjual(){
        for(int a=1; a<jenis.length; a++){
            System.out.println(a+"."+jenis[a]);
            System.out.println("   Harga : Rp."+harga[a]+",00");}
        System.out.print("Masukkan Nomor Pilihan Anda   : ");
        pilihan = input.nextInt();
        System.out.print("Pilihan Jenis (jantan/betina) : ");
        pilihjenis = input.next();
        System.out.print("Berapa Ekor                   : ");
        jumlah = input.nextInt();
        return pilihan;
    }
    int pembayaran(){
        int total = harga[pilihan]*jumlah;
        System.out.println("Total Harga                   : Rp."+total);
        System.out.print("Masukkan uang pembayaran Anda : Rp.");
        bayar = input.nextInt();
        System.out.println("=========================================");
        if(bayar>total){
            kembali = bayar - total;
            System.out.println("Transaksi Berhasil, kembalian Anda Rp."+kembali);
        } else if (bayar==total){
            System.out.println("Transaksi Berhasil, Terima Kasih!");
        } else {
            System.out.println("Maaf, Uang Anda kurang sebesar Rp."+(kurang=total-bayar));
            System.out.println("Apakah anda ingin menambah uang pembayaran ?");
            System.out.print("Jawab (ya/tidak) --> ");
            jawaban = input.next();
                if(jawaban.equalsIgnoreCase("ya")){
                    System.out.println("=========================================");
                    System.out.print("Masukkan uang pembayaran yang kurang : Rp.");
                    bayar = input.nextInt();
                    if (bayar>kurang){
                        System.out.println("Pembayaran berhasil, kembalian Anda Rp. "+(kembali = bayar-kurang)+", terima kasih!");
                    } else if (bayar==kurang) {
                        System.out.println("Pembayaran berhasil, terima kasih!");
                    } else{
                        System.out.println("Pembayaran tidak berhasil, silahkan mengulangi program...");
                        System.out.println("=========================================");
                        System.exit(0);
                    }
                }
                else if( jawaban.equalsIgnoreCase("tidak") ){
                    System.out.println("Maaf, Pembayaran tidak berhasil, silahkan mengulangi program");
                    System.out.println("=========================================");
                    System.exit(0);
                }
            }
    return bayar;
    }
    void penampilan(){
        System.out.println("Hewan Yang Dibeli : "+jenis[pilihan]);
        System.out.println("Jumlah Pembelian  : "+jumlah);
        System.out.println("Harga Hewan       : "+(harga[pilihan]*jumlah));
        System.out.println("Jenis Hewan       : "+pilihjenis);
    }
}