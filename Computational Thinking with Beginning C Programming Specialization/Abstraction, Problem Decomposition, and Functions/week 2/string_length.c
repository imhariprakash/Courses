/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

#include <string.h>

/*
* Finds the length of a string
*/
int main(int argc, char** argv)
{
	char message[] = "Def Leppard rocks!";

	// count and print the length of the string
	int i = 0;
	while (message[i] != '\0')
	{
		i++;
	}
	printf("%s has %d characters\n", message, i);

	// print string length using function
	printf("%s has %zu characters\n", message, 
		strnlen(message, sizeof(message)));

	return (EXIT_SUCCESS);
}

