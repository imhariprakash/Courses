/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <limits.h>
#include <stdbool.h>

/*
* While Loops exercise solution
*/
int main(int argc, char** argv)
{
	int input = 0;
	int maxInput = INT_MIN;
	bool inputProvided = false;

	// loop while user keeps entering data
	while (input != -1)
	{
		// prompt for and get input
		printf("Enter an integer (-1 to quit): ");
		scanf("%d", &input);

		// set flag
		if (input != -1)
		{
			inputProvided = true;
		}

		// check for new max input
		if (input != -1 &&
			input > maxInput)
		{
			maxInput = input;
		}
	}

	// print max input or no data message
	printf("\n");
	if (inputProvided)
	{
		printf("Max number provided: %d\n", maxInput);
	}
	else
	{
		printf("No inputs other than -1 provided.\n");
	}

	printf("\n");
	return (EXIT_SUCCESS);
}

