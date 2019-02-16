public class Problem012 {

	static long bolensayısı = 0;
	static int sayı = 1;
	static int ekle = 2;
	
	public static void main(String[] args) {
		
		while(bolensayısı<500) {
			bolensayısı = 0;
			sayı += ekle; // 3,6,10,15 ....
			for(int i=1;i<=Math.sqrt(sayı);i++) {
				if(i*i == sayı) {
					bolensayısı+=1; 
					continue;
				}
				if(sayı%i==0)
					bolensayısı+=2;
			}
			ekle++;
		}
		System.out.println(sayı);

	}

}
