/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandom();

/*
* Demonstrates returning data from a function
*/
int main(int argc, char** argv)
{
	// initialize random number generator and generate numbers
	srand(time(0));
	for (int i = 1; i <= 5; i++)
	{
		printf("Random Number %d: %d\n", i, getRandom());
	}

	return (EXIT_SUCCESS);
}

/*
* Generates a random number
*/
int getRandom()
{
	return rand();
}
