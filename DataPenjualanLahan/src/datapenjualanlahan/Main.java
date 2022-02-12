package datapenjualanlahan;
public class Main {
    public Main(){
        System.out.println("===============================");
        System.out.println("|  PEMBUATAN SERTIFIKAT TANAH  |");
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        Main a = new Main();
        Transaksi b = new Transaksi();
        b.PengisianData();
    }
}