/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <ctype.h>

/*
* Switch Statements exercise solution
*/
int main(int argc, char** argv)
{
	char menuChoice;

	// Problem 1: Respond to menu choice

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
	switch (menuChoice)
	{
	case 'n':
		printf("Starting new game ...\n");
		break;
	case 'l':
		printf("Loading game ...\n");
		break;
	case 'o':
		printf("Displaying options ...\n");
		break;
	case 'q':
		printf("Quitting ...\n");
		break;
	default:
		printf("Invalid menu choice ...\n");
		break;
	}
	printf("\n");

	return (EXIT_SUCCESS);
}

