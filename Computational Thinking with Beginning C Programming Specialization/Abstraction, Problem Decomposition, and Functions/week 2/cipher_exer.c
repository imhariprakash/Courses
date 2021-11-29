/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <string.h>
#include <ctype.h>
#include <stdbool.h>

/*
* The Caesar Cipher exercise solution
*/
int main(int argc, char** argv)
{
	char shiftResponse;
	bool leftShift = true;
	int shiftAmount;

	// Note: With some C implementations, scanf reads in the
	// shiftResponse character but leaves the \n character from when the user
	// pressed the Enter key sitting on the input stream (the
	// keyboard input) waiting to be processed. The call to the
	// getchar function below clears that character out so
	// that the input stream is empty next time we do a scanf.
	// We need to do that after reading the shift amount as well

	// get left or right shift
	printf("Left or right shift (enter l or r)? ");
	scanf("%c", &shiftResponse);
	getchar();
	shiftResponse = tolower(shiftResponse);
	while (shiftResponse != 'l' && shiftResponse != 'r')
	{
		printf("\n");
		printf("Shift can only be left or right\n");
		printf("Left or right shift (enter l or r)? ");
		scanf("%c", &shiftResponse);
		getchar();
		shiftResponse = tolower(shiftResponse);
	}
	if (shiftResponse == 'r')
	{
		leftShift = false;
	}

	// get valid shift amount
	printf("\n");
	printf("Enter shift amount (1-25): ");
	scanf("%d", &shiftAmount);
	getchar();
	while (shiftAmount < 1 || shiftAmount > 25)
	{
		printf("\n");
		printf("Shift amount must be between 1 and 25\n");
		printf("Enter shift amount (1-25): ");
		scanf("%d", &shiftAmount);
		getchar();
	}

	char originalMessage[100];

	// prompt for and get valid string to be encrypted
	bool validMessage = false;
	printf("\n");
	printf("Enter message to be encrypted (upper case alphabetic characters only): ");
	fgets(originalMessage, sizeof(originalMessage), stdin);
	int originalMessageLength = strnlen(originalMessage, sizeof(originalMessage)) - 1;
	while (!validMessage)
	{
		// invalid if non-upper case alpha characters in message (don't include newline at end))
		validMessage = true;
		for (int i = 0; i < originalMessageLength; i++)
		{
			if (!isupper(originalMessage[i]))
			{
				printf("\n");
				printf("Message must contain only upper case alphabetic characters!\n");
				printf("Enter message to be encrypted (upper case alphabetic characters only): ");
				fgets(originalMessage, sizeof(originalMessage), stdin);
				originalMessageLength = strnlen(originalMessage, sizeof(originalMessage)) - 1;

				// reset flag and exit for loop
				validMessage = false;
				break;
			}
		}
	}

	// build encrypted string (make sure it's null-terminated)
	// Note that we have to use pointers here to dynamically
	// allocate the encryptedMessage array in Visual Studio
	char* encryptedMessage = malloc((originalMessageLength + 1) * sizeof(char));
	for (int i = 0; i < originalMessageLength; i++)
	{
		if (leftShift)
		{
			encryptedMessage[i] = originalMessage[i] - shiftAmount;
			if (encryptedMessage[i] < 'A')
			{
				encryptedMessage[i] += 'Z' - 'A' + 1;
			}
		}
		else
		{
			encryptedMessage[i] = originalMessage[i] + shiftAmount;
			if (encryptedMessage[i] > 'Z')
			{
				encryptedMessage[i] -= 'Z' - 'A' + 1;
			}
		}
	}
	encryptedMessage[originalMessageLength] = '\0';

	// build decrypted string (make sure it's null-terminated)
	// Note that we have to use pointers here to dynamically
	// allocate the decryptedMessage array in Visual Studio
	int encryptedMessageLength = originalMessageLength;
	char* decryptedMessage = malloc((encryptedMessageLength + 1) * sizeof(char));
	for (int i = 0; i < encryptedMessageLength; i++)
	{
		if (leftShift)
		{
			decryptedMessage[i] = encryptedMessage[i] + shiftAmount;
			if (decryptedMessage[i] > 'Z')
			{
				decryptedMessage[i] -= 'Z' - 'A' + 1;
			}
		}
		else
		{
			decryptedMessage[i] = (encryptedMessage[i] - shiftAmount);
			if (decryptedMessage[i] < 'A')
			{
				decryptedMessage[i] += 'Z' - 'A' + 1;
			}
		}
	}
	decryptedMessage[encryptedMessageLength] = '\0';

	// print messages
	printf("\n");
	printf("Original Message : %s", originalMessage);
	printf("Encrypted Message: %s\n", encryptedMessage);
	printf("Decrypted Message: %s\n", decryptedMessage);

	// free memory because we used pointers
	// this is just good pointer use; you don't need it for this exercise
	free(encryptedMessage);
	encryptedMessage = NULL;
	free(decryptedMessage);
	decryptedMessage = NULL;

	printf("\n");
	return (EXIT_SUCCESS);
}