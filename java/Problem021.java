public class Problem021 {

	public static void main(String[] args) {
		
		int sayı = 1;
		int toplam = 0;
		
		while(sayı!=10000) {
			toplam += isAmicable(sayı) ? sayı : 0; 
			sayı++;	
		}
		System.out.println(toplam);		
	}

	private static boolean isAmicable(int sayı) {
		
		int sayı2 = 0;
		int temp = 0;
		
		sayı2 = bol(sayı);	
		temp = bol(sayı2);
		
		if(sayı == temp)
			return sayı!=sayı2 ? true : false;		
		
		return false;
	}

	private static int bol(int sayı) {
		
		int toplam = 0;

		for (int i=1;i<=sayı/2;i++)
			toplam += sayı%i==0 ? i : 0;
		
		return toplam;
		
	}

}
