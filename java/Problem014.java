public class Problem014 {

	public static void main(String[] args) {
		
		int enuzunzincir = 0;
		long uzunzinciresahipsayı = 0l;
		long sayı = 1l;
		int zincir = 0;
		long temp = 0l;
		
		while(sayı<1000000) {
			temp = sayı;  // sayının üzerinde değişiklikler yapılacağı için geçici bir değişkene atama yaptım.
			while(temp!=1) {  // temp 1'e ulaştığında döngüden çık ve hesapladığın zincir değerini if yapısında karşılaştır.
				if(temp%2==0)
					temp /= 2;
				else
					temp = 3*temp+1;
				zincir++;
			}
			if(enuzunzincir<zincir) {  // 1 milyona kadar olan sayılarda zincir değeri en uzun olan sayıyı bul ve "uzunzinciresahipsayı" değişkeninde tut.
				enuzunzincir = zincir;
				uzunzinciresahipsayı = sayı;
			}
      // yeni bir sayı üzerinde deneme yapmak için değerleri ayarla.
			sayı++;
			zincir = 0;
		}
		System.out.println(uzunzinciresahipsayı);
		
	}

}
