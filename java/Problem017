public class Problem017 {

	public static void main(String[] args) {
		
		int toplam = 0;
		
		for(int i=1;i<1000;i++) {
			toplam += degerAl(i);
		}
		toplam += "onethousand".length();
		System.out.println(toplam);

	}
	
	public static int degerAl(int i) {
		
		int x = 0,y = 0,z = 0;		
		int dizi[] = basamaklara_ayır(i);		
		x=dizi[0]; y=dizi[1]; z=dizi[2];
		
		int harftoplamı = 0;

		if(y==0 && z==0)  { // sayı tek basamaklıdır.
			harftoplamı = rakamlar(x);  // 1.basamak rakamsal değeri çekmek istiyorum
			return harftoplamı; 
		}
		
		else if(z==0)  {  // sayı iki basamaklıdır.
			
			harftoplamı = ikiBasamaklılar(x,y);			
			return harftoplamı; 
			
		}
		
		else {  // sayı üç basamaklıdır.
			
			harftoplamı += rakamlar(z);  // 3.basamak rakamsal değeri çekmek istiyorum
			harftoplamı += 7;  // hundred;
			
			if(x==0 && y==0)  // 100 için,
				return harftoplamı;
			
			harftoplamı += 3; //and
			if(y==0) 
				harftoplamı += rakamlar(z);
			
			else 
				harftoplamı += ikiBasamaklılar(x,y);
			return harftoplamı;
			
		}
		
	}

	private static int ikiBasamaklılar(int x,int y) {
		
		int harftoplamı = 0;
		
		if(y==1) {
			if(x==0) 
				harftoplamı += 3;  // ten
			else if(x==1)
				harftoplamı += 6;  // eleven
			else if(x==2)
				harftoplamı += 6;  // twelve
			else if(x==3)
				harftoplamı += 8;  // thirteen
			else if(x==5)
				harftoplamı += 7;  // fifteen
			else if(x==8)
				harftoplamı += 8;  // eighteen
			else {
				harftoplamı += rakamlar(x);  // 2.basamak rakamsal değeri çekmek istiyorum
				harftoplamı += 4;  // teen
			}
			
		}
		else {
			if(y==2) {
				harftoplamı += 6;  // twenty
			}
			else if(y==3)
				harftoplamı += 6;  // thirty
			else if(y==4)
				harftoplamı += 5;  // forty
			else if(y==5)
				harftoplamı += 5;  // fifty
			else if(y==8)
				harftoplamı += 6;  //eighty
			else {
				harftoplamı += rakamlar(y);  // 2.basamak rakamsal değeri çekmek istiyorum
				harftoplamı += 2;  //ty
			}
			harftoplamı += rakamlar(x);  // 1.basamak rakamsal değeri çekmek istiyorum
		}
		
		return harftoplamı;
		
	}

	private static int rakamlar(int x) {
		
		int harftoplamı = 0;  // x=0 değeri gelirse koşulların hiç biri sağlanmayacağı için 0 değeri döndürür
		
		if(x==1)
			harftoplamı = 3;  // one
		else if(x==2)
			harftoplamı = 3;  // two
		else if(x==3)
			harftoplamı = 5;  // three
		else if(x==4)
			harftoplamı = 4;  // four
		else if(x==5)
			harftoplamı = 4;  // five
		else if(x==6)
			harftoplamı = 3;  // six
		else if(x==7)
			harftoplamı = 5;  // seven
		else if(x==8)
			harftoplamı = 5;  // eight
		else if(x==9)
			harftoplamı = 4;  // nine
		
		return harftoplamı;
	}

	private static int[]  basamaklara_ayır(int i) {
		
		int [] dizi = new int[3];
	
		for(int j=0;j<3;j++) {
			dizi[j]=i%10;
			i/=10;
		}		
		
		return dizi;
				
	}

}
