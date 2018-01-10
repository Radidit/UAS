import java.util.Scanner;
public class main{
	public static void main(String[] args){
    
    int pilih;
    char ulang;
    Scanner input = new Scanner(System.in);
    
    System.out.println("\n\t\t Toko Elektronik\n");
    System.out.println("Create By : Rizki Firmanda");
    System.out.println("Tanggal   : 11 Desember 2015");
    System.out.println("=======================================");
    System.out.println();
        do{
    System.out.println("1. Laptop ");
    System.out.println("2. Smartphone");
    System.out.println("3. Smart tv ");
    System.out.print("\nSilahkan Masukan Pilihan anda : ");
    pilih = input.nextInt();
    System.out.println("\n=======================================\n");   
        switch(pilih){
            case 1:
                Laptop a = new Laptop();
                a.HasilElektronik();
                a.harga();
                a.hasil();
               
                break;
            
            case 2: 
                Smartphone b = new Smartphone();
                b.HasilElektronik();
                b.harga();
                b.hasil();
                break;
                
            case 3:
                Smarttv c = new Smarttv();
                c.HasilElektronik();
                c.harga();
                c.hasil();
                break;
            default :
                System.out.print("Pilihan anda tidak tersedia!!!");
        }
         System.out.println("\n=======================================\n");   
         System.out.print("\nApakah anda ingin membeli lagi [y/n] ? \n");
         ulang = input.next().charAt(0);
    }while(ulang == 'Y' || ulang == 'y');

    }
}