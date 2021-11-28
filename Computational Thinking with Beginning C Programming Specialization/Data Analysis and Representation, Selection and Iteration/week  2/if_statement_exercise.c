/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <ctype.h>

/*
* Exercise 1 solution
*/
int main(int argc, char** argv)
{
	int number;
	char menuChoice;

	// Problem 1: Print positive message

	// prompt for and read in number
	printf("Enter an integer: ");
	scanf("%d", &number);

	// print positive message if appropriate
	printf("\n");
	if (number >= 0)
	{
		printf("You entered a positive number\n");
	}

	// Problem 2: Print positive or negative message

	// prompt for and read in number
	printf("\n");
	printf("Enter an integer: ");
	scanf("%d", &number);

	// print positive or negative message
	printf("\n");
	if (number >= 0)
	{
		printf("You entered a positive number\n");
	}
	else
	{
		printf("You entered a negative number\n");
	}

	// Problem 3: Respond to menu choice

	// Note: With some C implementations, the scanf_s above reads in the
	// number but leaves the \n character from when the user
	// pressed the Enter key sitting on the input stream (the
	// keyboard input) waiting to be processed. The call to the
	// getchar function below clears that character out so
	// that when you ask the user for their menu choice below,
	// it works properly
	getchar();

	// print menu
	printf("\n");
	printf("**************\n");
	printf("N   New Game\n");
	printf("L   Load Game\n");
	printf("O   Options\n");
	printf("Q   Quit\n");
	printf("**************\n");

	// prompt for and get user menu choice
	printf("\n");
	printf("Enter your choice (N, L, O, or Q): ");
	scanf("%c", &menuChoice);
	menuChoice = tolower(menuChoice);

	// print message based on menu choice
	printf("\n");
	if (menuChoice == 'n')
	{
		printf("Starting new game ...\n");
	}
	else if (menuChoice == 'l')
	{
		printf("Loading game ...\n");
	}
	else if (menuChoice == 'o')
	{
		printf("Displaying options ...\n");
	}
	else if (menuChoice == 'q')
	{
		printf("Quitting ...\n");
	}
	else
	{
		printf("Invalid menu choice ...\n");
	}
	printf("\n");

	return (EXIT_SUCCESS);
}
