/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <string.h>

/*
 * Demonstrates CSV string processing
 */
int main(int argc, char** argv)
{
	struct Vector {
		float x;
		float y;
	};
	typedef struct Vector Vector;

	Vector point;

	// read in point string from user
	char pointString[100];
	printf("Enter x and y for point (no spaces, comma-separated): ");
	fgets(pointString, sizeof(pointString), stdin);

	// find comma index
	int commaIndex = -1;
	char* result = NULL;
	while (commaIndex == -1)
	{
		result = strchr(pointString, ',');
		if (result != NULL)
		{
			char* pointStringStart = &pointString[0];
			commaIndex = result - pointStringStart;
		}
		else
		{
			printf("\n");
			printf("Invalid input: comma not found\n");
			printf("Enter x and y for point (no spaces, comma-separated): ");
			fgets(pointString, sizeof(pointString), stdin);
		}
	}

	// extract x from point string
	//char xString[commaIndex + 1];
	// Visual Studio users can't create arrays with sizes based on user
	// input because of the compiler Visual Studio uses
	char* xString = malloc((commaIndex + 1) * sizeof(char));
	strncpy(xString, pointString, commaIndex);
	xString[commaIndex] = '\0';
	point.x = atof(xString);

	// Visual Studio: free memory because we used pointers
	free(xString);
	xString = NULL;

	// debug look at point string
	/*
	printf("\n");
	printf("Characters in user input\n");
	int pointStringLength = strnlen(pointString, sizeof(pointString));
	for (int i = 0; i <= pointStringLength; i++)
	{
	if (pointString[i] == '\0')
	{
	printf("Null Character\n");
	}
	else if (pointString[i] == '\n')
	{
	printf("Newline Character\n");
	}
	else
	{
	printf("%c\n", pointString[i]);
	}
	}
	printf("\n");
	*/

	// extract y from point string
	// don't include newline character in point string length
	int length = strnlen(pointString, sizeof(pointString)) - 1;
	//char yString[length - commaIndex];
	// Visual Studio users can't create arrays with sizes based on user
	// input because of the compiler Visual Studio uses
	char* yString = malloc((length - commaIndex) * sizeof(char));	
	int offset = commaIndex + 1;
	for (int i = 0; i < length - commaIndex - 1; i++)
	{
		yString[i] = pointString[i + offset];
	}
	yString[length - commaIndex - 1] = '\0';
	point.y = atof(yString);

	// Visual Studio: free memory because we used pointers
	free(yString);
	yString = NULL;

	// using strncpy
	/*
	char* yString = malloc((length - commaIndex) * sizeof(char));
	char* yStart = &pointString[0] + commaIndex + 1;
	strncpy(yString, yStart, length - commaIndex - 1);
	yString[length - commaIndex - 1] = '\0';
	point.y = atof(yString);
	free(yString);
	yString = NULL;
	*/

	// print point info
	printf("\n");
	printf("Point x: %f\n", point.x);
	printf("Point y: %f\n", point.y);

	printf("\n");
	return (EXIT_SUCCESS);
}

