/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

/*
* Demonstrates a two-dimensional array
*/
int main(int argc, char** argv)
{
	// calculate and store multiplication table
	int table[3][5];
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			table[i][j] = (i + 1) * (j + 1);
		}
	}

	// output multiplication table
	// print header
	printf("     ");
	for (int i = 1; i <= sizeof(table[0]) / sizeof(table[0][0]); i++)
	{
		printf("%5d", i);
	}
	printf("\n");

	// print multiplication table
	for (int i = 1; i <= sizeof(table) / sizeof(table[0]); i++)
	{
		printf("%5d", i);
		for (int j = 1; j <= sizeof(table[0]) / sizeof(table[0][0]); j++)
		{
			printf("%5d", table[i - 1][j - 1]);
		}
		printf("\n");
	}

	return (EXIT_SUCCESS);
}

