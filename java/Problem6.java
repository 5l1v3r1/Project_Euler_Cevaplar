public class Problem6 {

	public static void main(String[] args) {
		
		final int NUMBER = 100;
		long l1 = toplaminKaresi(NUMBER);
		long l2 = karesininToplami(NUMBER);
		System.out.println(l1-l2);

	}

	private static long toplaminKaresi(int number) {
		
		int toplam = 0;
		for(int i=1;i<=number;i++) {
			toplam += i;
		}
		return (long) Math.pow(toplam, 2);
		
	}
	
	private static long karesininToplami(int number) {
		
		int toplam = 0;
		for(int i=1;i<=number;i++) {
			toplam += Math.pow(i, 2);
		}
		return toplam;
		
	}

}
