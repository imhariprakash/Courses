/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <math.h>

 /*
  * Calculates floor and ceiling
  *
  * Only works for positive numbers
  * Only works to 2 decimal places
  */
int main(int argc, char** argv)
{
	float x;

	// prompt for and get float from user
	printf("Enter floating-point number: ");
	scanf("%f", &x);
	printf("\n");

	// calculate and print floor
	printf("Floor: %d\n", (int)x);
	
	// calculate and print ceiling
	printf("Ceiling: %d\n", (int)(x + 0.99));

	// calculate and print floor and ceiling using math.h
	printf("\n");
	printf("Floor using math.h: %d\n", (int)floorf(x));
	printf("Ceiling using math.h: %d\n", (int)ceilf(x));

    printf("\n");
	return (EXIT_SUCCESS);
}
