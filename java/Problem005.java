public class Problem5 {

	public static void main(String[] args) {
		
		// long startTime = System.currentTimeMillis(); 
		System.out.println(method());
		// long endTime = System.currentTimeMillis(); 
		// System.out.println((endTime-startTime));

	}

	private static long method() {
		
		/* 1-20 arasındaki asal sayılara bölğnebilen en küçük sayı ile başlayarak programın süresini kısalttım.
		 * 2*3*5*7*11*13*17*19 = 9699690
		 * */
		long sayi = 9699690; 
		int clock = 1;
		while(true) {
			sayi ++;
			clock=1;
			/*
			 * Asal sayılara tam bölünebilen sayılar az olduğu için, ilk olarak bu sayıları test ettim. Bu durum programın süresini ciddi anlamda kısalttı.
			 * */
			if(sayi%19 != 0)
				continue;
			else if(sayi%17 != 0)
				continue;
			else if(sayi%13 != 0)
				continue;
			else if(sayi%11 != 0)
				continue;
			else if(sayi%7 != 0)
				continue;
			else if(sayi%5 != 0)
				continue;
			for(int i=2;i<=20;i++) {
				if(sayi%i == 0) {
					clock ++;
				}
			}
			if(clock == 20) {
				return sayi;
			}
		}
	}

}
