/*
 * File:   main.c
 * Author: <your name here>
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LENGTH 100

typedef struct Input Input;
struct Input
{
	int num1;
	int num2;
	int num3;
};

void getInputValuesFromString(char string[], Input *inputValues);

/*
 * Programming Assignment 2
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
		Input inputValues;
		getInputValuesFromString(input, &inputValues);

		// Add your code between this comment
		// and the comment below. You can of
		// course add more space between the
		// comments as needed

		// calculate and print sum and average
		int sum = inputValues.num1 + 
			inputValues.num2 + 
			inputValues.num3;
		float average = (float)sum / 3;
		printf("%d %.2f\n", sum, average);
		
		// Don't add or modify any code below
		// this comment
		fgets(input, MAX_LENGTH, stdin);
	}

	return 0;
}

/*
* Extracts input values from provided string
*/
void getInputValuesFromString(char string[], Input *inputValues)
{
	// find first space index
	int spaceIndex = -1;
	char *result = NULL;
	result = strchr(string, ' ');
	char *stringStart = &string[0];
	spaceIndex = result - stringStart;

	// extract first number from string
	char* firstNumberString = malloc((spaceIndex + 1) * sizeof(char));
	strncpy(firstNumberString, string, spaceIndex);
	firstNumberString[spaceIndex] = '\0';
	inputValues->num1 = atoi(firstNumberString);

	// find second space index
	string = &string[0] + spaceIndex + 1;
	result = strchr(string, ' ');
	stringStart = &string[0];
	spaceIndex = result - stringStart;

	// extract second number from string
	char* secondNumberString = malloc((spaceIndex + 1) * sizeof(char));
	strncpy(secondNumberString, string, spaceIndex);
	secondNumberString[spaceIndex] = '\0';
	inputValues->num2 = atoi(secondNumberString);

	// extract third number from string
	string = &string[spaceIndex + 1];
	inputValues->num3 = atoi(string);

	// free memory
	free(firstNumberString);
	firstNumberString = NULL;
	free(secondNumberString);
	secondNumberString = NULL;	
}
