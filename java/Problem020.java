import java.math.BigInteger;

public class Problem020 {

	public static void main(String[] args) {
		
		BigInteger sayı = new BigInteger("1");
		int toplam = 0;
		
		for(int i=100;i>1;i--) {
			sayı = sayı.multiply(BigInteger.valueOf(i));
		}
		
		String s = String.valueOf(sayı);
		
		for(int i=0;i<s.length();i++) {
			toplam += s.charAt(i)-48;
		}
		
		System.out.println(toplam);

	}

}
