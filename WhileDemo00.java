import java.util.Scanner;

public class WhileDemo00{
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		
		int jumlahData;
		
		System.out.print("Masukan jumlah angka= ");
		jumlahData=input.nextInt();
		
		int sum=0;
		int count=0;
		while (count<5){
			sum += input.nextInt();
			count++;
		}
		System.out.println("Sum = "+sum);
	}
}