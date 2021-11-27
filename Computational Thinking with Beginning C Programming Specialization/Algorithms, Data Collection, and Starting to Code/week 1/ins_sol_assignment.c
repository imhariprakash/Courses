/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

#define MAX_LENGTH 100

/*
 * Programming Assignment 1
 */
int main(int argc, char** argv)
{
	// IMPORTANT: Only add code in the section
	// indicated below. The code I've provided
	// makes your solution work with the 
	// automated grader on Coursera
	char input[MAX_LENGTH];
	fgets(input, MAX_LENGTH, stdin);
	while (input[0] != 'q')
	{
		// Add your code between this comment
		// and the comment below. You can of
		// course add more space between the
		// comments as needed
		
		// print symbols for the first 10 elements
		printf("H\n");
		printf("He\n");
		printf("Li\n");
		printf("Be\n");
		printf("B\n");
		printf("C\n");
		printf("N\n");
		printf("O\n");
		printf("F\n");
		printf("Ne\n");

		// Don't add or modify any code below
		// this comment
		fgets(input, MAX_LENGTH, stdin);
	}

	return 0;
}
