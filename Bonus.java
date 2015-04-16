import java.util.Scanner;

public class Bonus{
  public static void main (String[] args)
  {
 int jb, Bonus, Total ;
 
 Scanner scan = new Scanner(System.in );
 
 System.out.println("Masukan Jumlah Barang:");
 jb = scan.nextInt();
 
 Bonus = (jb) / (2);
 
 Total = jb + Bonus;
 
 System.out.println("Masukan Jumlah Barang yang Dibeli = " +jb);
 System.out.println("Jumlah Bonus = " + Bonus);
 System.out.println("Total Item yang dibawa Pulang = " + Total);
  }
}
