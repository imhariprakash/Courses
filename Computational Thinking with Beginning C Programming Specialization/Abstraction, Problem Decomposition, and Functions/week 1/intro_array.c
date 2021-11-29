/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates arrays
  */
int main(int argc, char** argv)
{
	int scores[5];

	//scores[0] = 100;
	//scores[1] = 95;

	// fill the array with test scores
	for (int i = 0; i < 5; i++)
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

	// print array
	printf("\n");
	for (int i = 0; i < 5; i++)
	{
		printf("Score %d is %d\n", i + 1, scores[i]);
	}

	return (EXIT_SUCCESS);
}
