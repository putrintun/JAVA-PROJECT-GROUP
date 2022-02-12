package ProjekKelompok;
public class DataPeternakan {
    String nama, tipe;
    int jantan, betina, jumlah;
    void isiDATA(String nama, String tipe, int jantan, int betina){
        this.nama = nama;
        this.tipe = tipe;
        this.jantan = jantan;
        this.betina = betina;
        this.jumlah = jantan+betina;
    }
    void tampilDATA(){
            System.out.println("- "+this.nama);
            System.out.println("  Tipe Hewan    : "+this.tipe);
            System.out.println("  Jumlah Hewan  : "+this.jumlah);
            System.out.println("  Jumlah Jantan : "+this.jantan);
            System.out.println("  Jumlah Betina : "+this.betina);
    }
}