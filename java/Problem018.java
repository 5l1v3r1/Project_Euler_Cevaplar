package project_euler;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem018 {

	static long sayilar[][] ;
	static long indis[][];
	static ArrayList <HashMap<String,Integer>> tstore = new ArrayList<>();
	static long toplam[];
	static int i=0;
	
	final static int SATIRUZUNLUGU;
	
	static {
		sayilar = new long[][] {
			{75},
			{95,64},
			{17,47,82},
			{18,35,87,10},
			{20, 4,82,47,65},
			{19, 1,23,75, 3,34},
			{88, 2,77,73, 7,63,67},
			{99,65, 4,28, 6,16,70,92},
			{41,41,26,56,83,40,80,70,33},
			{41,48,72,33,47,32,37,16,94,29},
			{53,71,44,65,25,43,91,52,97,51,14},
			{70,11,33,28,77,73,17,78,39,68,17,57},
			{91,71,52,38,17,14,91,43,58,50,27,29,48},
			{63,66, 4,68,89,53,67,30,73,16,69,87,40,31},
			{ 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23},
			};
		SATIRUZUNLUGU = sayilar.length;
	}

	public static void main(String[] args) {
		
		indis = new long[SATIRUZUNLUGU][(int) Math.pow(2, SATIRUZUNLUGU-1)];
		toplam = new long[(int) Math.pow(2, SATIRUZUNLUGU-1)];
		
		for(int b=1;b<SATIRUZUNLUGU;b++) {
			clock((int) Math.pow(2, b-1),(int) Math.pow(2, b));
		}
		
		for(int y=0;y<SATIRUZUNLUGU;y++) {
			tstore.add(new HashMap<String,Integer>());
		}		
		topla();
		buyuguBul();
	}
	
	private static void buyuguBul() {
		long b=0;
		for(long k:toplam) {
			if(k>b)
				b=k;
		}
		System.out.println("büyük sayı= "+b);
	}

	static void topla( ) {
	    long deger=0;
		for(int i=0;i<(int) Math.pow(2, SATIRUZUNLUGU-1);i++) {
			for(int j=0;j<SATIRUZUNLUGU;j++) {
				deger += sayilar[j][(int) indis[j][i]];		
			}
			toplam[i]=deger;
			deger=0;
		}
		for(long g:toplam)
			System.out.print(g+ " ");
	}
	
	static void clock(int cevrim,int taban) {
		i++;
		int g=((int) Math.pow(2, SATIRUZUNLUGU-1))/taban;
		int h=0;
		for(int a=0;a<cevrim;a++) {
			for(int c=h;c<h+g;c++) {
				indis[i][c] = indis[i-1][c];
			}
			h+=g;
			for(int c=h;c<h+g;c++) {
				indis[i][c] = indis[i-1][c]+1;
			}
			h+=g;
		}
	}
}
