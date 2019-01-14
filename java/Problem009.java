public class Problem009 {

	public static void main(String[] args) {
		
		System.out.println(pythagoreanTriplet());	
	}

	private static int pythagoreanTriplet() {
		int c=0;
		double islem = 0;				
		for(int a=1;a<1000;a++) {
			for(int b=1;b<1000-a;b++) {
				c = 1000-a-b;
				islem = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2);
				if(islem == 0) {
					if(a<b && b<c)
						return a*b*c;		
				}	
			}
		}
		return 0;	
	}

}
