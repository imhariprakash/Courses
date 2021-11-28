/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates using while loops, for loops, and nested for loops
  *
  * The idea for this problem comes from Beginning C by Ivor Horton
  */
int main(int argc, char** argv)
{
	int width;
	int height;

	// get valid width
	printf("\n");
	printf("Enter width (3-20): ");
	scanf("%d", &width);
	while (width < 3 ||
		width > 20)
	{
		// print error message and get new width
		printf("\n");
		printf("Width must be between 3 and 20.\n");
		printf("Enter width (3-20): ");
		scanf("%d", &width);
	}

	// get valid height
	printf("Enter height (3-20): ");
	scanf("%d", &height);
	while (height < 3 ||
		height > 20)
	{
		// print error message and get new height
		printf("\n");
		printf("Height must be between 3 and 20.\n");
		printf("Enter height (3-20): ");
		scanf("%d", &height);
	}

	// print top row
	printf("\n");
	for (int i = 1; i <= width; i++)
	{
		printf("*");
	}
	printf("\n");

	// print interior of box
	for (int i = 2; i < height; i++)
	{
		printf("*");
		for (int j = 2; j < width; j++)
		{
			printf(" ");
		}
		printf("*");
		printf("\n");
	}

	// print bottom row
	for (int i = 1; i <= width; i++)
	{
		printf("*");
	}
	printf("\n");

	return (EXIT_SUCCESS);
}
