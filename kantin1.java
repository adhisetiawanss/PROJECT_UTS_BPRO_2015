// package DaftarMenu;

import java.util.Scanner;

public class kantin
{
    public static void main(String[] args)
    {
//        inisialisasi java library scanner
        Scanner scan = new Scanner(System.in);
//        menampilkan menu makanan
        System.out.println("KANTIN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Soto Ayam        Rp 10.000,00"); //h1
        System.out.println("2. Nasi Rawon       Rp 15.000,00"); //h2
        System.out.println("4. es teh           Rp 2.000,00"); //h3
        System.out.println("5. es jeruk         Rp 2.000,00"); //h4
        System.out.println("6. es dawet         Rp 7.000,00"); //h5
        System.out.println("7. Gado-Gado        Rp 9.000,00"); //h6
        System.out.println("");

//        inisialisasi pembayaran awal
        int harga = 0;
//        inisialisasi harga ketiga menu
        int h1 = 10000, h2 = 15000, h3 = 2000, h4 = 2000, h5 = 7000, h6 = 9000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); ) //method equals dengan string
        {
        System.out.println("___________________________________________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.println("___________________________________________________________________");

        if (inNomor == 1)
        {
//            jika nomor satu, maka menu yang dipilih adalah soto ayam, dan harganya adalah h1, yang merupakan harga menu pertama
            menu = " Soto Ayam";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1;
        }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka menu yang dipilih adalah gado gado, dan harganya adalah h2, yang merupakan harga menu kedua
                menu = " Gado-Gado";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
//            jika nomor tiga, maka menu yang dipilih adalah es teh, dan harganya adalah h3, yang merupakan harga menu ketiga
                    menu = " es teh";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3;
                }
                     else
    
//            jika selain nomor satu sampai tiga, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }
                     

//            User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}