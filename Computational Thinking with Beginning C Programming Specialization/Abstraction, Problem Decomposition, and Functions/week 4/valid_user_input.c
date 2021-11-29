/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound);
float averageScoreArray(int scores[], int count);

/*
* Demonstrates getting valid user input
*/
int main(int argc, char** argv)
{
	// get number of scores to enter
	int n = getValidInteger("How many scores do you want to enter (1 to 10)? ",
		"Number of scores must be between 1 and 10!", 1, 10);

	// read in scores
	//int scores[n];
	// Visual Studio users can't create arrays with sizes based on user
	// input because of the compiler Visual Studio uses
	int* scores = malloc(n * sizeof(int));
	for (int i = 0; i < n; i++)
	{
		scores[i] = getValidInteger("Enter score (0 to 100): ",
			"Score must be between 0 and 100!", 0, 100);
	}

	// print average of scores
	printf("Average score: %.2f\n", averageScoreArray(scores, n));

	// free memory
	free(scores);
	scores = NULL;

	return (EXIT_SUCCESS);
}

/*
* Averages scores in array
*/
float averageScoreArray(int scores[], int count)
{
	int sum = 0;
	for (int i = 0; i < count; i++)
	{
		sum += scores[i];
	}
	return (float)sum / count;
}

/*
* Gets valid integer input from user
*/
int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound)
{
	int input;

	// prompt for and get input
	printf(promptString);
	scanf("%d", &input);

	// validate input
	while (input < lowerBound ||
		input > upperBound)
	{
		// print error message and get new input
		printf("\n");
		printf(errorString);
		printf("\n");
		printf(promptString);
		scanf("%d", &input);
	}

	return input;
}