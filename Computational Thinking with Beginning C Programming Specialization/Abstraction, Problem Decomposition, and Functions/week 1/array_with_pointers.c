/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates array size using pointers
  */
int main(int argc, char** argv)
{
	//int scores[3];

	int n;

	// get valid array size
	printf("Number of scores to enter (1-5): ");
	scanf("%d", &n);
	while (n < 1 || n > 5)
	{
		printf("\n");
		printf("Number of scores must be between 1 and 5\n");
		printf("Number of scores to enter (1-5): ");
		scanf("%d", &n);
	}

	// declare array and demonstrate size calculations
	printf("\n");

	// Visual Studio users can't create arrays with sizes based 
	// on user input because of the compiler Visual Studio uses
	//int scores[n];
	//printf("Total array size: %lu\n", sizeof(scores));
	//printf("Array element size: %lu\n", sizeof(scores[0]));
	//printf("Number of array elements: %lu\n", sizeof(scores) / sizeof(scores[0]));
	//printf("\n");

	// We can't use sizeof on a pointer to find out how 
	// much memory was allocated for the pointer
	int* scores = malloc(n * sizeof(int));
	printf("Total array size: %lu\n", n * sizeof(int));
	printf("Array element size: %lu\n", sizeof(scores[0]));
	printf("Number of array elements: %lu\n", (n * sizeof(int)) / sizeof(scores[0]));
	printf("\n");

	// read in scores
	//for (int i = 0; i < sizeof(scores) / sizeof(scores[0]); i++)
	for (int i = 0; i < n; i++)
	{
		// prompt for and get valid test score
		printf("Enter score %d (0-100): ", i + 1);
		scanf("%d", &scores[i]);
		while (scores[i] < 0 || scores[i] > 100)
		{
			printf("\n");
			printf("Score must be between 0 and 100\n");
			printf("Enter score %d (0-100): ", i + 1);
			scanf("%d", &scores[i]);
		}
	}

	// print test scores
	printf("\n");
	//for (int i = 0; i < sizeof(scores) / sizeof(scores[0]); i++)
	for (int i = 0; i < n; i++)
	{
		printf("Score %d is %d\n", i + 1, scores[i]);
	}

	// it's always good practice to free memory and null pointers
	// when you're done with them
	free(scores);
	scores = NULL;

	return (EXIT_SUCCESS);
}
