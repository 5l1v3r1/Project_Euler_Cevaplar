#include <stdio.h>

int fibonacciSum();

int main() {

	printf("%d",fibonacciSum());

}

int fibonacciSum() {
	
	int t,t1 = 0;
	int t2 = 1;
	int sum = 0;

	while(t1<=4000000) {

		t = t1+t2;
		t1 = t2;
		t2 = t;

		if(t1%2 == 0)
			sum += t1;

	}

	return sum;

}
