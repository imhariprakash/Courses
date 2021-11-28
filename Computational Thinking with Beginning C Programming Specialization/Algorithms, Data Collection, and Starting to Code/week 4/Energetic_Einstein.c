/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define C 299792458

/*
 * Calculates Einstein's energy equation
 */
int main(int argc, char** argv)
{
	float m;
	float e;

	// get mass and calculate energy
	printf("Enter mass in kg: ");
	scanf("%f", &m);
	e = m * powf(C, 2);
	printf("Energy: %f Joules\n", e);

	return (EXIT_SUCCESS);
}
