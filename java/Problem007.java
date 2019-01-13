public class Problem007 {

	public static void main(String[] args) {
		
		System.out.println(primeFactor());

	}
	
	private static long primeFactor() {
		
		int sıra = 1;
		int sayı = 2;
		etiket:while(true) {
			sayı++;
			for(int i=2;i<sayı;i++) {
				if(sayı%i == 0) {
					continue etiket;
				}			
			}
			sıra ++;
			if(sıra == 10001)
				return sayı;
			
		}
		
	}

}
