import java.io.*;
public class kantin
{
	public static void main (String args []) throws Exception
	{
	BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
	String menu [] = new String [3];
	String nama [] = new String [3];
	int harga [] = new int [3];
	int total [] = new int [3];
	int jumlah [] = new int [3];
	int harga [] = new int [3];
	int pil = 0;
	do
	{
		System.out.println("==============================================================");
		System.out.println("		\"KANTIN STIKOM\" ");
		System.out.println("==============================================================");
		System.out.println("1. Input pemesanan makanan dan minuman ");
		System.out.println("2. Lihat data Pemesanan ");
		System.out.println("3. KELUAR");
		System.out.print("Masukan no pilihan anda (1-3) : ");
		pil=Integer.parseInt(k.readLine());
		
		switch (pil)
		{
			case 1:
		System.out.println("==============================================================");
		System.out.println("		\"KANTIN STIKOM\" ");
		System.out.println("==============================================================");
				for (int i=0;i<3;i++)
			{
				System.out.println(i+1+".");
					System.out.print("Nama Pemesan : ");
					nama[i]=k.readLine();
					System.out.print("Menu yang dipesan = ");
					menu[i]=k.readLine();
					System.out.print("Jumlah menu yang dipesan = ");
					jumlah[i]=Integer.parseInt(k.readLine());
					
					if ( menu[i].equalsIgnoreCase("Nasi Soto")) {
					harga[i]=10000;
					}
					else if ( menu[i].equalsIgnoreCase("Nasi Pecel")) {
					harga[i]=12000;
					}
					else if ( menu[i].equalsIgnoreCase("Es Teh")) {
					harga[i]=2000;
					}
					else if ( menu[i].equalsIgnoreCase("Es Jeruk")) {
					harga[i]=3000;
					}
					total[i]=jumlah[i]*harga[i];
			}
			break;
				case 2:
			System.out.println("==============================================================");
			System.out.println("		\"KANTIN STIKOM\" ");
			System.out.println("==============================================================");
				for (int j=0;j<3;j++)	{	
					System.out.println(j+1+".");
					System.out.println("Nama Pemesan  : "+nama[j]);
					System.out.println("Menu yang dipesan : " + menu[j]);
					System.out.println("Jumlah tiket yang dipesan : " + jumlah[j]);
					System.out.println("Total harga (Rp): " + total[j]);
					}
				break;	
				case 3 : 
				System.exit(0);
		}
	}
	while (true);
	}
}