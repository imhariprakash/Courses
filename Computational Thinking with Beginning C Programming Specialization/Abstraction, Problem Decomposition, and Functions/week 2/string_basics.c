/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

/*
* Demonstrates string basics
*/
int main(int argc, char** argv)
{
	char message[] = "ftatrwsy";

	// output string information
	int i = 0;
	while (message[i] != '\0')
	{
		printf("message[%d] Address: %p Contents: %c\n", i, &message[i], message[i]);
		i++;
	}

	// print message string
	printf("Message: %s\n", message);

	return (EXIT_SUCCESS);
}

