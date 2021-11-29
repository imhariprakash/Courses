/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

void swapValues(int* firstValue, int* secondValue);

/*
* Swaps two values
*/
int main(int argc, char** argv)
{
	int value1 = 5;
	int value2 = 10;

	printf("Before swap\n");
	printf("-----------\n");
	printf("Value1: %d\n", value1);
	printf("Value2: %d\n", value2);

	swapValues(&value1, &value2);

	printf("\n");
	printf("After swap\n");
	printf("----------\n");
	printf("Value1: %d\n", value1);
	printf("Value2: %d\n", value2);

	return (EXIT_SUCCESS);
}

/*
* Swaps the two values
*/
void swapValues(int* firstValue, int* secondValue)
{
	int temp;
	temp = *secondValue;
	*secondValue = *firstValue;
	*firstValue = temp;
}
