#include <stdio.h>
#include "weather.h"

int main(void) {
	double temperatures[7] = {6.9, 12.3, 9.0, 5.3, 9.8, 1.8, 0.3};
	printAverageTemp(temperatures, 7);
	return 0;
}

/*
compile weatherstats.c to weatherstats.o using
gcc -std=c11 -Wall -fmax-errors=10 -Wextra -c weatherstats.c -o weatherstats.o
either make program.o object file similarly and then link using
gcc -std=c11 -Wall -fmax-errors=10 -Wextra weatherstats.o program.o -o program
or do both at once using
gcc -std=c11 -Wall -fmax-errors=10 -Wextra weatherstats.o program.c -o program


*/
