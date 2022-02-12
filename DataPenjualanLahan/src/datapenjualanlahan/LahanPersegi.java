package datapenjualanlahan;
public class LahanPersegi extends Transaksi{
    public double sisi;
    public double luas;
    public double keliling;
    public int harga;
    public int bayar;
    public int kembali;
    public int kurang;
    
    public void getSisi(){
        System.out.print("Panjang Sisi Lahan : ");
        this.sisi = input.nextDouble();
        System.out.println("-------------------------------");
    }
    @Override
    double Luas(){
        this.luas = sisi*sisi;
        return luas;
    }
    @Override
    double Keliling(){
        this.keliling = 4*sisi;
        return keliling;
    }
    public void Harga(){
        this.harga = (int) (luas*500000);
        System.out.println("Harga        : Rp."+harga);
        System.out.print("Pembayaran   : Rp.");
        bayar = input.nextInt();
        if(bayar>harga){
            kembali = bayar - harga;
            System.out.println("Transaksi Berhasil, kembalian Anda Rp."+kembali);
        } else if (bayar==harga){
            System.out.println("Transaksi Berhasil, Terima Kasih!");
        } else {
            System.out.println("Maaf, Uang Anda kurang sebesar Rp."+(kurang=harga-bayar));
            System.out.println("Apakah anda ingin menambah uang pembayaran ?");
            System.out.print("Jawab (ya/tidak) --> ");
            String jawaban = input.next();
                if(jawaban.equalsIgnoreCase("ya")){
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan uang pembayaran yang kurang : Rp.");
                    bayar = input.nextInt();
                    if (bayar>kurang){
                        System.out.println("Pembayaran berhasil, kembalian Anda Rp. "+(kembali = bayar-kurang)+", terima kasih!");
                    } else if (bayar==kurang) {
                        System.out.println("Pembayaran berhasil, terima kasih!");
                    } else{
                        System.out.println("Pembayaran tidak berhasil, silahkan mengulangi program");
                        System.out.println("-------------------------------");
                        System.exit(0);
                    }
                }
                else if( jawaban.equalsIgnoreCase("tidak") ){
                    System.out.println("Maaf, Pembayaran tidak berhasil, silahkan mengulangi program");
                    System.out.println("-------------------------------");
                    System.exit(0);
                }
            }
    }
    @Override
    public void getData(){
        System.out.println("Luas Lahan   : "+luas+" Meter Persegi");
        System.out.println("Keliling     : "+keliling+" Meter");
        System.out.println("Harga Tanah  : "+harga);
        System.out.println("Keterangan   : LUNAS");
    }
}