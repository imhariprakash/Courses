/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates while loops
  */
int main(int argc, char** argv)
{
	int score;

	// prompt for and get score
	printf("Enter test score (0-100): ");
	scanf("%d", &score);

	// validate score
	while (score < 0 ||
		score > 100)
	{
		// print error message and get new score
		printf("\n");
		printf("Score must be between 0 and 100.\n");
		printf("Enter test score (0-100): ");
		scanf("%d", &score);
	}

	return (EXIT_SUCCESS);
}
