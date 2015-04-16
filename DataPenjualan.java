import java.util.*;
public class DataPenjualan {
	public static void main (String[]args){
	int [][]databrg = {{10,4,12,2},
					{3,5,8,9},
					{2,10,6,2},
					{12,8,7,4},
					{9,5,5,11},
					{10,4,4,8},
					{6,12,12,10}};
	
	String [] hari= {"Senin ","Selasa","Rabu  ","Kamis ","Jumat ","Sabtu ","Minggu"};
	String [] barang= {"Pensil","  Buku Gambar","      Buku","   Penghapus","Omset Barang"};
	int omset=0;
	int omset1=0;
	int omset2=0;
	int omset3=0;
	int omset4=0;
	
	System.out.print("Barang/Hari" + "\t");
	
	for (int b=0; b<barang.length; b++)
		{
			System.out.print(barang[b] + "\t");
		}
	System.out.println("");
	
	for (int i=0; i<hari.length; i++)
		{
			System.out.print(hari[i] + "\t" + "\t");
			for (int j=0; j<databrg[i].length; j++)
				{
					System.out.print(databrg[i][j] + "\t" + "\t");
					omset+=databrg[i][j];
				}
				System.out.print( "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+omset );
				omset=0;
				System.out.println();
		}
		for (int a=0; a<databrg.length; a++)
		{
			omset1+=databrg[a][0];
			omset2+=databrg[a][1];
			omset3+=databrg[a][2];
			omset4+=databrg[a][3];
		}
		System.out.print("Total" + "\t\t"+ omset1 + "\t\t" + omset2 + "\t\t" + omset3 + "\t\t" + omset4 + "\t\t" );
	
		System.out.println(" ");
		System.out.println("||================================================================||");
		System.out.println("||  Barang - barang yang dijual :                                 ||");
		System.out.println("||  1. Pensil = Rp.2500,-               2. Buku Tulis = Rp.3000,- ||");
		System.out.println("||  3. Buku Gambar = Rp.3500,-          4. Penghapus = Rp.500,-   ||");
		System.out.println("||================================================================||");
    
    String [] namabarang = {"Pensil" , "Buku Gambar" , "Buku Tulis" , "Penghapus"};
    int [] hargabarang = {2500 , 3500 , 3000 , 500};
    Scanner k = new Scanner (System.in);
    int omset5 [] = new int [namabarang.length];
    int baranglaris [] = new int [namabarang.length];
    int totalsenin [] = new int [namabarang.length];
    int totalmingguan [] = {0,0,0,0,0,0,0};
    int harian=0;
    int totalakhir=0;
    int banyak=0;
    int sedikit=0;
    int rata=0;
    int ratatot=0;
    int total [] = {0,0,0,0,0,0,0};
  
  
    for(int a=0;a<hari.length;a++)
    {
      //Looping Hari Senin-Minggu
      System.out.println("Hari "+hari[a]);
       for(int b=0;b<namabarang.length;b++)
       {
         //Looping Nama Barang
         System.out.print("Jumlah " +namabarang[b]+ " yang laris" + " ");
          baranglaris [b] = k.nextInt();
          //Mencari barang terlaris dan tidak laris
          if (baranglaris[banyak]>baranglaris[b]);
          {
            banyak=banyak;
          }
          if (baranglaris[b]>baranglaris[banyak]){
            banyak=b;
          }
           if (baranglaris[sedikit]<baranglaris[b]);
          {
            sedikit=sedikit;
          }
          if (baranglaris[b]<baranglaris[sedikit]){
            sedikit=b;
          }
          totalsenin[b] = baranglaris[b]*hargabarang[b];
          harian+=totalsenin[b];
       }
          total[a]+=harian;
          totalmingguan[a]+=total[a];
          totalakhir+=totalmingguan[a];
          ratatot = totalakhir/7;
		  rata    = harian / 4;
		  System.out.println(" ");
          System.out.println("Produk paling laris / banyak terjual di hari " +hari[a]+ " adalah " +namabarang[banyak] );
          System.out.println("Produk paling tidak laris / banyak terjual di hari " +hari[a]+ " adalah " +namabarang[sedikit]);
          System.out.println("Rata - rata penjualan produk di hari " +hari[a]+ " adalah " +"Rp."+rata);
          banyak=0;
          sedikit=0;
          System.out.println("Omset Per hari " +hari[a]+ " adalah " +"Rp."+total[a]);
          harian=0;
          System.out.println("\n");
    }     
    
    System.out.println("   Total pendapatan selama seminggu "+"Rp." +totalakhir+                 "");
    System.out.println("   Rata - rata pendapatan selama seminggu "+"Rp." +ratatot+                 "");
    System.out.println("====================================================================");
	}
}