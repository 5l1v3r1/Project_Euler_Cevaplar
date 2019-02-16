public class Problem010 {
	
	// 2 milyona kadar olan asal sayıların toplamı

	public static void main(String[] args) {
		
		// Asal sayı yalnızca 1'e ve kendisine bölünen sayıdır.
		long toplam = 2; // 2 asal sayısını toplama katıyorum
		int sayı = 2; 
		
		a:while(sayı!=2000000) {
			sayı++; // saymaya 3 sayısından başlıyorum
			if(sayı%2==0)  // sayı 2ye bölünüyorsa diğer bölenleri denemeden devam ediyorum.
				continue;
			for(int i=3;i<=Math.sqrt(sayı);i+=2) { // çift sayıları önceki if koşulu ile denediğim için atlıyorum. i değişkenini 2 arttırıyorum.
				if(sayı%i==0) {
					continue a;
				}
			}
			toplam += sayı;
		}
		System.out.println(toplam);

	}

}
