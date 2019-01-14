#include <stdio.h>
int tamBolen3veya5toplam(int);
int main() {
	
	printf("%d",tamBolen3veya5toplam(1000));

}

int tamBolen3veya5toplam(int number) {

	int sum = 0;
	for(int i=3;i<number;i++) {
		if(i%3==0 || i%5==0)
			sum+=i;
	}
	return sum;
}
