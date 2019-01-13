public class Problem1 {
	
	static final int NUMBER = 1000;

	public static void main(String[] args) {
		
		System.out.println(tamBolen3veya5toplam(NUMBER));

	}

	private static int tamBolen3veya5toplam(int number) {
		int sum = 0;
		for(int i=3;i<number;i++) {
			if(i%3==0 || i%5==0) 
				sum+=i;
		}
		return sum;
		
	}
	
}
