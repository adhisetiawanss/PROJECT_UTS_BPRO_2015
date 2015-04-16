import java.io.*; 
public class Ketupat 
{ 
    public static void main(String[]args) throws IOException 
	{ 
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Masukan Bilangan Yang Diinginkan :"); 
		
        int i; 
        int n = Integer.parseInt(br.readLine());
	
        for (i = 0; i < (2 * n) + 1; i++)
		{ 
 
            for (int j = 0; j < (2 * n) + 1; j++) 
			{ 
                if (i < n) 
				{ 
                    if ((j > n - i) && (j < n + i)) 
						{ 
							System.out.print(" "); 
						}
						else
						{ 
							System.out.print("*"); 
						} 
                } 
				else 
				{ 
                    if ((j > i - n) && (j < 3*n-i)) 
						{ 
							System.out.print(" "); 
						} 
						else 
						{ 
							System.out.print("*"); 
						} 
                } 
            } 
          System.out.println(); 
        } 
    } 
} 