/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

#include <string.h>

/*
* Demonstrates searching a string
*/
int main(int argc, char** argv)
{
	char data[] = "8.7,5.3";

	// find comma manually
	int length = strnlen(data, sizeof(data));
	int i = 0;
	while (data[i] != ',' &&
		i < length)
	{
		i++;
	}
	if (i < length)
	{
		printf("Comma is located at %d\n", i);
	}
	else
	{
		printf("Comma not found\n");
	}

	// find comma using standard function
	char* result = NULL;
	result = strchr(data, ',');
	if (result != NULL)
	{
		printf("Result address is %p\n", result);
		printf("Data string address is %p\n", &data[0]);

		char* dataStart = &data[0];
		printf("Comma is located at %d\n", result - dataStart);
	}
	else
	{
		printf("Comma not found\n");
	}

	return (EXIT_SUCCESS);
}

