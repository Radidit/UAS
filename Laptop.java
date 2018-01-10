import java.util.Scanner;
class Laptop extends Elektronik implements Transaksi {

	double hargaBarang=5000000;
    String Namatouch;
    int ukuran;
    int jumsupport;
    String Namacdrom;
    
    Scanner input = new Scanner(System.in);
	 public Laptop()
	 {
		 super("Laptop","Windows", 36, false);
	 }
	 
    
        public void harga()
	 {
		 System.out.println("\n Harga Barang : "+hargaBarang);
	 }
    
        public void settouchpad(String Namatouch, int ukuran){
        this.Namatouch = Namatouch;
        this.ukuran = ukuran;
        
    }
    
    public void setcdrom(String Namacdrom, int suport){
        this.Namacdrom= Namacdrom;
        jumsupport= suport;
        
    }

    public void gettouchpad(){
        System.out.println("\n Nama  : "+Namatouch);
        System.out.println(" ukuran  : "+ukuran);
    }
    
        public void getcdrom(){
        System.out.println("\n Nama rom   : "+Namacdrom);
        System.out.println(" jumlah yang mendukung : "+jumsupport);
    }
    
    public void hasil(){
        System.out.print("\n informasi Touchpad ");
        Laptop a = new Laptop();
        a.settouchpad("Touchpad",14);
        a.gettouchpad();
        System.out.print("\n informasi CD - rom ");
        a.setcdrom("CD - ROM",10);
        a.getcdrom();
    }


}