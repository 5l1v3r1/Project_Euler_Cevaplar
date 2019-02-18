public class Problem023 {
	
	static boolean abundant[] = new boolean[28124];
	static int test = 0;

	public static void main(String[] args) {
		
		int toplam = 0;
		
		for(int i=1;i<=28123;i++) {
			abundant[i] = isAbundant(i) ? true : false;				
		}
		
		e : for(int i=1;i<=28123;i++) {
			for(int j=1;j<=i/2;j++) {
				if(abundant[j] && abundant[i-j]) {
					continue e;
				}		
			}
			toplam += i;	
		}
		
		System.out.println(toplam);
	}

	private static boolean isAbundant(int sayı) {
		
		int toplam = 0;
		for(int i=1;i<=sayı/2;i++) {
			toplam += sayı%i == 0 ? i : 0;
		}
		return toplam>sayı ? true : false;
	}

}
