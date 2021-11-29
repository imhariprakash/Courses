/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

/*
* Min and Max exercise solution
*/
int main(int argc, char** argv)
{
	int n = 5;

	// Problem 3

	// get valid array size
	printf("Number of scores to enter: ");
	scanf("%d", &n);
	while (n <= 0)
	{
		printf("\n");
		printf("You must enter at least one score\n");
		printf("Number of scores to enter: ");
		scanf("%d", &n);
	}
	printf("\n");

	// declare array and get user input
	//int scores[n];
	//for (int i = 0; i < sizeof(scores) / sizeof(scores[0]); i++)

	// two lines of code above commented out for Problem 3
	// two lines of code below added for Problem 3
	int* scores = malloc(n * sizeof(int));
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

	// find min and max in array
	// start with the assumption that the first element is both
	// the min and max in the array
	int min = scores[0];
	int max = scores[0];
	//for (int i = 1; i < sizeof(scores) / sizeof(scores[0]); i++)

	// line of code above commented out for Problem 3
	// line of code below added for Problem 3
	for (int i = 1; i < n; i++)
	{
		if (scores[i] < min)
		{
			min = scores[i];
		}
		if (scores[i] > max)
		{
			max = scores[i];
		}
	}

	// print min and max
	printf("\n");
	printf("Min score entered: %d\n", min);
	printf("Max score entered: %d\n", max);

	// two lines of code below added for Problem 3
	// this is just good pointer use; you don't need it for this exercise
	free(scores);
	scores = NULL;

	printf("\n");
	return (EXIT_SUCCESS);
}

