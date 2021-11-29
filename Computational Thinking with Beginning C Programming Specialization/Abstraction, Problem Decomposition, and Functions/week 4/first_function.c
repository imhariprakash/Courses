/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

void printMessage();

/*
* Demonstrates a simple function
*/
int main(int argc, char** argv)
{
	// print welcome message
	printMessage();

	return (EXIT_SUCCESS);
}

/*
* Prints a message
*/
void printMessage()
{
	printf("Welcome to the amazing first function program!\n");
	printf("\n");
	printf("The welcome message you're reading was output by\n");
	printf("a function. Amazing.\n");
}



