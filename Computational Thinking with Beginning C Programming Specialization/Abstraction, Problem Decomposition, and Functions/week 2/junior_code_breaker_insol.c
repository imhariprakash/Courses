/*
 * File:   main.c
 * Author: <your name here>
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_LENGTH 100

/*
 * Junior Codebreaker Programming Assignment
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
		
		int counts[26] = { 0 };

		// count the occurrences of each letter
		// for loop solution
		for (int i = 0; i < strlen(input); i++)
		{
			// only process alphabetic characters
			if (isalpha(input[i]))
			{
				// convert character to array index and increment count
				char character = toupper(input[i]);
				counts[character - 'A']++;
			}
		}
		
		// print out input and non-zero character counts
		for (int i = 0; i < sizeof(counts) / sizeof(counts[0]); i++)
		{
			if (counts[i] > 0)
			{
				printf("%c%d ", i + 'A', counts[i]);
			}
		}
		printf("\n");

		// while loop solution
		/*
		int i = 0;
		while (input[i] != '\0')
		{
			// only process alphabetic characters
			if (isalpha(input[i]))
			{
				// convert character to array index and increment count
				char character = toupper(input[i]);
				counts[character - 'A']++;
			}
			i++;
		}

		// print out input and non-zero character counts
		for (int i = 0; i < sizeof(counts) / sizeof(counts[0]); i++)
		{
			if (counts[i] > 0)
			{
				printf("%c%d ", i + 'A', counts[i]);
			}
		}
		printf("\n");
		*/

		// Don't add or modify any code below
		// this comment
		fgets(input, MAX_LENGTH, stdin);
	}

	return 0;
}
