/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates do-while loops
  */
int main(int argc, char** argv)
{
	int score;

	// prompt for and get score
	do
	{
		printf("Enter test score (0-100): ");
		scanf("%d", &score);

		// print error message as appropriate
		if (score < 0 ||
			score > 100)
		{
			printf("\n");
			printf("Score must be between 0 and 100.\n");
		}
	} 
	while (score < 0 ||
		score > 100);

	return (EXIT_SUCCESS);
}
