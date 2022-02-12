package ProjekKelompok;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("|       WELCOME TO THE FARM HOUSE       |");
        System.out.println("=========================================");
        System.out.println("1. Melihat Data Hewan di Peternakan");
        System.out.println("2. Melakukan Transaksi Pembelian Hewan");
        System.out.print("PILIHAN NOMOR ANDA : ");
        int jawab = a.nextInt();
        switch(jawab){
            case 1 : DataPeternakan b = new DataPeternakan();
                     boolean c = true;
                     while(c){
                         System.out.println("=========================================");
                         System.out.println("|             DAFTAR PILIHAN            |");
                         System.out.println("=========================================");
                         String[] jenis = {" ","AYAM", "SAPI", "KAMBING", "BEBEK", "SEMUA"};
                         for(int d=1; d<jenis.length; d++){
                            System.out.println(d+". "+jenis[d]);
                         }
                         System.out.print("PILIHAN NOMOR ANDA : ");
                         int pilih = a.nextInt();
                         System.out.println("=========================================");
                         switch(pilih){
                             case 1 : b.isiDATA("AYAM", "Kampung, Broiler, Pejantan", 25, 30);
                                      b.tampilDATA(); break;
                             case 2 : b.isiDATA("SAPI", "Brahman, Bali, Limosin", 18, 20);
                                      b.tampilDATA(); break;
                             case 3 : b.isiDATA("KAMBING", "Boer, Jawarandu", 30, 20);
                                      b.tampilDATA(); break;
                             case 4 : b.isiDATA("BEBEK", "Peking, Manila, Serati", 20, 20);
                                      b.tampilDATA(); break;
                             case 5 : b.isiDATA("AYAM", "Kampung, Broiler, Pejantan", 25, 30);
                                      b.tampilDATA(); 
                                      b.isiDATA("SAPI", "Brahman, Bali, Limosin", 18, 20);
                                      b.tampilDATA(); 
                                      b.isiDATA("KAMBING", "Boer, Jawarandu", 30, 20);
                                      b.tampilDATA(); 
                                      b.isiDATA("BEBEK", "Peking, Manila, Serati", 20, 20);
                                      b.tampilDATA(); break;
                         }
                         System.out.println("=========================================");
                         boolean e = true;
                         while(e){
                            System.out.print("Ingin Menampilkan Lagi ? (ya/tidak) : ");
                            String tampil = a.next();
                            if(tampil.equalsIgnoreCase("ya")){
                                c = true;
                                e = false;
                            }else if(tampil.equalsIgnoreCase("tidak")){
                                c = false;
                                e = false;
                            }else{
                                System.out.println("Pilihan tidak ada, harap muat ulang jawaban");
                            } 
                         }
                     }
                     break;
            case 2 : Transaksi f = new Transaksi();
                     Pengantaran g = new Pengantaran();
                     System.out.println("=========================================");
                     System.out.println("|       PENGISIAN DATA TRANSAKSI        |");
                     System.out.println("=========================================");
                     f.daftarjual();
                     f.pembayaran();
                     g.IsiData();
                     System.out.println("=========================================");
                     System.out.println("|       TRANSAKSI PEMBELIAN HEWAN       |");
                     System.out.println("=========================================");
                     f.penampilan();
                     System.out.println("-----------------------------------------");
                     g.penampilan();
                     break;
            default: System.out.println("TIDAK ADA PILIHAN TERSEBUT, HARAP MUAT ULANG");
                     break;
        }
        System.out.println("=========================================");
    }
}