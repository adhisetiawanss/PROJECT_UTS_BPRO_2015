import java.util.Scanner;

public class AplikasiHitung{
	public static void main (String args []){
		
		Scanner input = new Scanner(System.in);
		int hargaKaos = 25000;
		int jumlahKaos = 40;
		int jumlahBeli, jumlahBonus, total, totalkaos, sisa, bayar, kembali;
		
		System.out.println("=============================");
		System.out.println(" ||    Aplikasi Hitung    || ");
		System.out.println(" ||  Promo Beli 2 Dapat 1 || ");
		System.out.println("=============================");
		
		//input
		System.out.print("Masukan jumlah kaos yang dibeli : ");
		jumlahBeli = input.nextInt();
		System.out.println("Harga Kaos @25000");
		System.out.println("=============================");
		
		//proces
		jumlahBonus = jumlahBeli/2;
		totalkaos = jumlahBeli+jumlahBonus;
		total = jumlahBeli*hargaKaos;
		sisa = jumlahKaos-jumlahBeli-jumlahBonus;
		
		//output
		System.out.println("Jumlah kaos yang dibeli : "+jumlahBeli);
		System.out.println("Bonus kaos yang didapatkan : "+jumlahBonus);
		System.out.println("Total kaos : "+totalkaos);
		System.out.println("Harga bayar : "+total);
		System.out.println("Sisa stock kaos : "+sisa);
		
		//input
		System.out.println("=============================");
		System.out.print("Pembayaran : ");
		bayar = input.nextInt();
		kembali = bayar-total;
		System.out.print("Kembalian : "+kembali);
		System.out.println("");	
		System.out.println("       Created By Coey       ");
		System.out.println("=============================");
	}
}