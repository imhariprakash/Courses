/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates for loops
  */
int main(int argc, char** argv)
{
	int n;

	// prompt for and get number of squares to print
	printf("How many squares do you want to print (1-10)? ");
	scanf("%d", &n);

	// print squares from 1 to n
	for (int i = 1; i <= n; i++)
	{
		printf("The square of %d is %d\n", i, i*i);		
	}

	return (EXIT_SUCCESS);
}
