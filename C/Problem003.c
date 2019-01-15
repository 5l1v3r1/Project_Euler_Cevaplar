#include <stdio.h>
int main() {

	long sayi = 600851475143;
	int buyuk;
	for(int i=2;sayi!=1;i++) {
		if(sayi%i == 0) {
			buyuk = i;
			sayi /= i;
			i--;
		}
	}
	printf("%d",buyuk);

}
