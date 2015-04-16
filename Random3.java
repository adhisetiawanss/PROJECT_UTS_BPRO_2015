import java.util.Random;
class Random3 {
public static final void main(String... aArgs){
Random randomGenerator = new Random();
System.out.print("Daftar Bilangan Random = ");
System.out.println("");
System.out.println("");
for (int idx = 1; idx <= 10; ++idx){
int randomInt = randomGenerator.nextInt(100);
log("dRandom : " + randomInt);
}
System.out.println("");
log("menampilkan hasil bil random.........");
}
private static void log(String aMessage){
System.out.println(aMessage);
}
}

