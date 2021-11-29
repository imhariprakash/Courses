/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <math.h>

/*
* Demonstrates array analysis
*/
int main(int argc, char** argv)
{
	int scores[4];
	int size = sizeof(scores) / sizeof(scores[0]);

	// read in scores
	for (int i = 0; i < size; i++)
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

	// calculate mean
	int sum = 0;
	for (int i = 0; i < size; i++)
	{
		sum += scores[i];
	}
	float mean = (float)sum / size;

	// calculate standard deviation
	// sum squares of difference of each data point from mean
	// divide by size - 1
	// take square root
	float sum_of_squared_differences = 0;
	for (int i = 0; i < size; i++)
	{
		sum_of_squared_differences += powf(scores[i] - mean, 2);
	}
	float stdev = sqrtf(sum_of_squared_differences / (size - 1));

	// print test scores and stats
	printf("\n");
	for (int i = 0; i < size; i++)
	{
		printf("Score %d: %d\n", i + 1, scores[i]);
	}
	printf("\n");
	printf("Mean: %.2f\n", mean);
	printf("Standard Deviation: %.2f\n", stdev);

	return (EXIT_SUCCESS);
}

