public class Problem4 {

	public static void main(String[] args) {
		
		System.out.println(sayiUret());

	}

	private static int sayiUret() {
		
		int polindrome_number = 0;
		int carpim = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				 carpim = i * j;
				if(isPolindrome(carpim) && carpim > polindrome_number) {
					polindrome_number = carpim;
				}
			}
		}
		
		return polindrome_number;
	}

	private static boolean isPolindrome(int number) {
		String s = Integer.toString(number);
		StringBuilder s1 = null;
		StringBuilder s2 = null;
		if(s.length()%2 == 0) {
			 s1 = new StringBuilder(s.substring(0,s.length()/2));
			 s2 = new StringBuilder(s.substring(s.length()/2,s.length()));
		} else {
			s1 = new StringBuilder(s.substring(0,s.length()/2));
			s2 = new StringBuilder(s.substring(s.length()/2+1,s.length()));
		}
		s2.reverse();
		if(s1.toString().equals(s2.toString())) {
			return true;}
		else 
			return false;
		
	}

}
