/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound);
void printCharacter(char character, int numTimes);
void printBoxInterior(int width, int height);

/*
* Prints a box
*/
int main(int argc, char** argv)
{
	int width;
	int height;

	// get valid width and height from user
	width = getValidInteger("Enter width (3-20): ",
		"Width must be between 3 and 20", 3, 20);
	height = getValidInteger("Enter height (3-20): ",
		"Height must be between 3 and 20", 3, 20);

	// print top of box
	printf("\n");
	printCharacter('*', width);
	printf("\n");

	// print interior of box
	printBoxInterior(width, height);

	// print bottom of box
	printCharacter('*', width);
	printf("\n");

	return (EXIT_SUCCESS);
}

/*
* Get valid integer input from user
*/
int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound)
{
	int input;

	// prompt for and get input
	printf(promptString);
	scanf("%d", &input);

	// validate input
	while (input < lowerBound || input > upperBound)
	{
		printf("\n");
		printf(errorString);
		printf("\n");
		printf(promptString);
		scanf("%d", &input);
	}

	return input;
}

/*
* Prints the given character numTimes times
*/
void printCharacter(char character, int numTimes)
{
	for (int i = 0; i < numTimes; i++)
	{
		printf("%c", character);
	}
}

/*
* Prints the interior of the box
*/
void printBoxInterior(int width, int height)
{
	for (int i = 2; i < height; i++)
	{
		printCharacter('*', 1);
		printCharacter(' ', width - 2);
		printCharacter('*', 1);
		printf("\n");
	}
}