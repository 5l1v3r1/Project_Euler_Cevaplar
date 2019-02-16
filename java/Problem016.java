import java.math.BigInteger;

public class Problem016 {

	public static void main(String[] args) {
		
		int toplam = 0;
		BigInteger sayı = new BigInteger("2");
		BigInteger on = new BigInteger("10");
		
		sayı = sayı.pow(1000);
		
		while(sayı.toString()!="0") {
			
			toplam += (sayı.mod(on)).intValue();
			sayı = sayı.divide(on);
			
		}
		
		System.out.println(toplam);
		
	}

}
