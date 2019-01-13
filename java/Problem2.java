public class Problem2 {
	
	static final long NUMBER = 4000000;
	static long sum = 0;
	static long t = 0;
	static long t1 = 0;
	static long t2 = 1;

	public static void main(String[] args) {
		
		System.out.println(fibonacciSum());

	}

	private static long fibonacciSum() {
			
		t = t1 + t2;
		t1 = t2;
		t2 = t;
		
		if(t1>=NUMBER)
			return sum;
		else {
			if(t1%2 == 0)
				return sum = t1 + fibonacciSum();
			else {
				return fibonacciSum();
			}
		}
		
	}

}
