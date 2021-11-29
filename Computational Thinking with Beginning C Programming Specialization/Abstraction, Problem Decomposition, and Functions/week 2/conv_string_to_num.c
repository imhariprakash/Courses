/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

#include <string.h>

/*
 * Demonstrates converting strings to numbers
 */
int main(int argc, char** argv)
{
	char floatStringData[100];
	float floatData;

	// read in float data
	printf("Enter Floating Point Data: ");
	fgets(floatStringData, sizeof(floatStringData), stdin);

	printf("Float String Data: %s\n", floatStringData);

	// convert and print float data
	floatData = atof(floatStringData);
	printf("Float Data: %f\n", floatData);

	char intStringData[100];
	int intData;

	// read in int data
	printf("\n");
	printf("Enter Integer Data: ");
	fgets(intStringData, sizeof(intStringData), stdin);

	printf("Integer String Data: %s\n", intStringData);

	// convert and print int data
	intData = atoi(intStringData);
	printf("Integer Data: %d\n", intData);

	return (EXIT_SUCCESS);
}

