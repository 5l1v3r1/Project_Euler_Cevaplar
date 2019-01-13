public class Problem3 {

	static final long NUMBER = 600851475143l;
	static int largest = 0;
	
	public static void main(String[] args) {
		
		System.out.println(primeFactor(NUMBER));
	}

	private static long primeFactor(long number) {
		
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i == 0) {
				number/=i;
				largest = i;
				if(number!=1)
					primeFactor(number);
				else 
					return i;
			}			
		}
		
		return number;
		
	}

}
