import java.util.*;

public class WhileDemo01{
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		
		int max=0;
		int min=99;
		double rataRata=0.0;
		int sum=0;
		int count=0;
		System.out.print("Masukan jumlah data: ");
		jumlahData=input.nextInt();
		
		
		while (count<jumlahData){
			sum += input.nextInt();
			rataRata = sum/jumlahData;
			//max = count 
			//min
			count++;
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+rataRata);
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}
}