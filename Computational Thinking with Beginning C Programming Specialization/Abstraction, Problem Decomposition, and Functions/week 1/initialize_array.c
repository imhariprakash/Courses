/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>

 /*
  * Demonstrates array initialization 
  */
int main(int argc, char** argv)
{
	int scores[5] = { 0 };

	// print scores
	for (int i = 0; i < 5; i++)
	{
		printf("Score %d is %d\n", i + 1, scores[i]);
	}

	return (EXIT_SUCCESS);
}
