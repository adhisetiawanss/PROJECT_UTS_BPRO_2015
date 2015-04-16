import java.util.*;

public class PencetakanBilanganGanjil{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
     System.out.println("masukan bilangan ganjil: ");
    int i=1, ganjil=1; 
    int n=sc.nextInt ();
    
    while(i<=n){
    
    System.out.println(i+". "+ ganjil);
    ganjil = ganjil+2;
    i++;
    }
  }
}