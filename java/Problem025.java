import java.math.BigInteger;

public class Problem025 {
	
	public static int index = 1;

	public static void main(String[] args) {
		
		System.out.println(method(new BigInteger("1"),new BigInteger("1")));

	}

	private static int method(BigInteger i, BigInteger j) {
		
		BigInteger t = i.add(j);
		i = j;
		j = t;
		index++;
		
		return i.toString().length()==1000 ? index : method(i,j);
		
	}	
	
}
