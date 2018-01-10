import java.util.Scanner;
class Smarttv extends Elektronik implements Transaksi {
		double hargaBarang=8000000;
        String NamaBatrai;
        String NamaTuner;
        int jumTombol, panjangkabel;
    
    Scanner input = new Scanner(System.in);
    
	 public Smarttv()
	 {
		 super("Smart Tv","Android", 29, false);
     }
    
    public void harga()
	 {
		 System.out.println("\n Harga Barang : "+hargaBarang);
	 }
    
    public void setRemote(String NamaBatrai, int Tombol){
        this.NamaBatrai = NamaBatrai;
        jumTombol = Tombol;
        
    }
    
    public void setTuner(String NamaTuner, int kabel){
        this.NamaTuner= NamaTuner;
        panjangkabel = kabel;
        
    }

    public void getRemote(){
        System.out.println("\n Nama Batrai   : "+NamaBatrai);
        System.out.println(" Jumlah Tombol : "+jumTombol);
    }
    
        public void getTuner(){
        System.out.println("\n Nama Port   : "+NamaTuner);
        System.out.println(" Panjang Kabel : "+panjangkabel);
    }
    
    public void hasil(){
        System.out.print("\n informasi Remote ");
        Smarttv a = new Smarttv();
        a.setRemote("ABC",23);
        a.getRemote();
        System.out.print("\n informasi Tunner ");
        a.setTuner("Tunner",20);
        a.getTuner();
    }
    
}