import java.util.Scanner;
class Smartphone extends Elektronik implements Transaksi {

		double hargaBarang=1500000;
        String Namalampu;
        int lamawaktu;
        String Namausb;
        int panjangkabel;
    
     Scanner input = new Scanner(System.in);
    
	 public Smartphone()
	 {
		 super("Smartphone","Android", 27, true);
	 }
    
        public void harga()
	 {
		 System.out.println("\n Harga Barang : "+hargaBarang);
	 }

    
        public void setlampu(String Namalampu, int waktu){
        this.Namalampu = Namalampu;
        lamawaktu = waktu;
        
    }
    
    public void setmicrousb(String Namausb, int kabel){
        this.Namausb= Namausb;
        panjangkabel = kabel;
        
    }

    public void getlampu(){
        System.out.println("\n Nama Lampu   : "+Namalampu);
        System.out.println(" Waktu tahan (jam) : "+lamawaktu);
    }
    
        public void getmicrousb(){
        System.out.println("\n Nama Port   : "+Namausb);
        System.out.println(" Panjang Kabel : "+panjangkabel);
    }
    
    public void hasil(){
        System.out.print("\n informasi Lampu ");
        Smartphone a = new Smartphone();
        a.setlampu("Lampu Flash",12);
        a.getlampu();
        System.out.print("\n informasi port usb ");
        a.setmicrousb("Micro USB",10);
        a.getmicrousb();
    }
    
}