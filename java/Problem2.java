public class Problem2 {
	
	static final long NUMBER = 4000000;
	static long toplam = 0;
	static long t = 0;
	static long t1 = 0;
	static long t2 = 1;

	public static void main(String[] args) {
		
		System.out.println(fibonacciToplam());

	}

	private static long fibonacciToplam() {
			
		t = t1 + t2;
		t1 = t2;
		t2 = t;
		
		if(t1>=NUMBER)
			return toplam;
		else {
			if(t1%2 == 0)
				return toplam = t1 + fibonacciToplam();
			else {
				return fibonacciToplam();
			}
		}
		
	}

}
