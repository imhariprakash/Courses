/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

/*
 * Demonstrates why we start indexing at 0
 */
int main(int argc, char** argv)
{
	int scores[] = { 100, 95, 90, 85, 80 };

	// output array information
	for (int i = 0; i < 5; i++)
	{
		printf("scores[%d] Address: %p Contents: %d\n", i, &scores[i], scores[i]);
	}

	return (EXIT_SUCCESS);
}
