/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

/*
* For Loops exercise solution
*/
int main(int argc, char** argv)
{
	// Problem 1

	int maxNumber;

	// prompt for and get max number
	printf("Enter maximum integer: ");
	scanf("%d", &maxNumber);

	// print even numbers up to max number
	printf("\n");
	printf("Even numbers from 0 to %d\n", maxNumber);
	for (int i = 0; i <= maxNumber; i++)
	{
		if (i % 2 == 0)
		{
			printf("%d\n", i);
		}
	}
	printf("\n");

	// Problem 2

	int rowWidth;

	// prompt for and get row width
	printf("Enter number of asterisks in a row: ");
	scanf("%d", &rowWidth);

	// print row
	printf("\n");
	for (int i = 1; i <= rowWidth; i++)
	{
		printf("*");
	}
	printf("\n");
	printf("\n");

	// Problem 3

	int numRows;

	// prompt for and get row width and num rows
	printf("Enter number of asterisks in a row: ");
	scanf("%d", &rowWidth);
	printf("Enter how many rows to print: ");
	scanf("%d", &numRows);

	// print rows
	printf("\n");
	for (int i = 1; i <= numRows; i++)
	{
		for (int j = 1; j <= rowWidth; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	printf("\n");

	// Problem 4

	int maxRowWidth;

	// prompt for and get max row width
	printf("Enter max number of asterisks in a row: ");
	scanf("%d", &maxRowWidth);

	// print rows
	printf("\n");
	for (int i = 1; i <= maxRowWidth; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			printf("*");
		}
		printf("\n");
	}

	printf("\n");
	return (EXIT_SUCCESS);
}

