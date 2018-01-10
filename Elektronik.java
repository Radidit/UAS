abstract class Elektronik{
	 protected String NamaBarang;
     protected String OS;
	 protected int jumBarang;
	 protected boolean layarsentuh = false;
	 
	 public Elektronik(String NamaBarang, String OS, int Barang, boolean sentuh)
	 {
		 this.NamaBarang = NamaBarang;
         this.OS = OS;
		 jumBarang = Barang;
		 layarsentuh = sentuh;
	 }
		 
	 public void HasilElektronik()
	     {
		     System.out.println(" Nama Barang    : " + NamaBarang);
             System.out.println(" Sistem Operasi : " + OS);
			 System.out.println(" Jumlah Barang  : " + jumBarang);
			 System.out.println(" Layar Sentuh   : " + layarsentuh);
	     }
}