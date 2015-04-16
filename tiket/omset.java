import java.util.*;
public class omset{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    String []produk={"Pensil","Bk.gambar","Bk.tulis","Penghapus"};
    int []harga={11000,8000,7000,6500};
    int qty[]=new int[harga.length];      //quantity (jumlah produk terjual)
    int omsetH=0;        //omset harian
    int omsetM=0;        //omset mingguan
    int a=0,max=0;
    double totalharian=0;          //jumlah seluruh produk yg terjual per hari
    int plglaku=0;       //produk paling laku (indeks)
    int total=0;        //jumlah seluruh produk terjual per minggu
    double totproduk[]=new double[produk.length];         //jumlah per produk terjual dalam satu minggu
    String [] days={"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    
 
    for(int i=0;i<days.length;i++){
      System.out.println("\n"+(i+1)+"). Transaksi hari "+days[i]);
      System.out.println("||===============================================||");
      System.out.println("||      No. \tProduk \t\t\tHarga \t\tTerjual     ||");
        for(int j=0;j<produk.length;j++){
          System.out.print("||\t"+(j+1)+").\t"+produk[j]+"\t\t"+harga[j]+"\t\t");
          qty[j]=sc.nextInt();
          totproduk[j]+=qty[j];
          totalharian+=qty[j];
          omsetH+=qty[j]*harga[j];
            if (qty[j]>a)
			{
              max=qty[j];
              a=qty[j];
              plglaku=j;
            }
         }
       omsetM+=omsetH;
       double rataharian=totalharian/produk.length;
       System.out.println("Omset hari "+days[i]+" : Rp "+omsetH);
       System.out.println("Produk paling laris : "+produk[plglaku]+" (terjual sebanyak "+max+" buah)");
       System.out.println("Rata-rata produk terjual : "+rataharian);
        System.out.println("Rata-rata omset per produk : Rp "+(int)omsetH/produk.length);
       
       max=0;plglaku=0;totalharian=0;a=0;omsetH=0;
    }
    System.out.println("\n\t\t\tDATA PENJUALAN MINGGU INI\n=====================================================================================================");
      for (int l=0;l<totproduk.length;l++){
        total+=(int)totproduk[l];
      }
    System.out.println("No. \tProduk \t\tTerjual \t\tRata2 penjualan minggu ini \tPersentase produk");
    System.out.println("=====================================================================================================");
      for(int k=0;k<produk.length;k++){
        System.out.println(k+1+".\t"+produk[k]+"\t\t"+(int)totproduk[k]+" buah\t\t"+totproduk[k]/days.length+"\t\t\t"+Math.round(totproduk[k]/total*100)+"%");
         System.out.println("-----------------------------------------------------------------------------------------------------"); 
          if (totproduk[k]>a)
		  {
              max=(int)totproduk[k];
              a=(int)totproduk[k];
              plglaku=k;
          }
      }
     System.out.println("\n\t\t\t total produk minggu ini : "+total+" buah");
     System.out.println("\n\t\t\tomset minggu ini : Rp "+omsetM);
     System.out.println("\n\t\t\tproduk paling laris minggu ini: "+produk[plglaku]+", terjual sebanyak "+(int)totproduk[plglaku]+" buah");
  
}
}
