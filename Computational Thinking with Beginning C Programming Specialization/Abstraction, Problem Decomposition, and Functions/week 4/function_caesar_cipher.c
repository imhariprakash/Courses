/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#define __STDC_WANT_LIB_EXT1__ 1
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

char getValidShiftDirection();
int getValidShiftAmount();
void getValidMessage(char* message, int messageSize);
char* encryptMessage(char* message, int messageSize,
	bool leftShift, int shiftAmount);
char* decryptMessage(char* message, int messageSize,
	bool leftShift, int shiftAmount);

/*
* Functional Caesar Cipher exercise solution
*/
int main(int argc, char** argv)
{
	bool leftShift = true;
	int shiftAmount;

	// get left or right shift
	char shiftResponse = getValidShiftDirection();
	if (shiftResponse == 'r')
	{
		leftShift = false;
	}

	// get shift amount
	shiftAmount = getValidShiftAmount();

	// get message to encrypt
	char originalMessage[100];
	getValidMessage(&originalMessage, 
		sizeof(originalMessage));
	int originalMessageLength =
		strnlen(originalMessage, sizeof(originalMessage));

	// build encrypted and decrypted strings
	char* encryptedMessage = encryptMessage(
		originalMessage, originalMessageLength,
		leftShift, shiftAmount);
	char* decryptedMessage = decryptMessage(
		encryptedMessage, originalMessageLength,
		leftShift, shiftAmount);

	// print messages
	printf("\n");
	printf("Original Message : %s\n", originalMessage);
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

/*
* Gets a valid shift direction (l or r)
*/
char getValidShiftDirection()
{
	char shiftDirection;

	// Note: With some C implementations, scanf reads in the
	// shiftDirection character but leaves the \n character from 
	// when the user pressed the Enter key sitting on the input 
	// stream (the keyboard input) waiting to be processed. The 
	// call to the getchar function below clears that character 
	// out so that the input stream is empty next time we do a scanf.

	// prompt for and get valid shift direction
	printf("Left or right shift (enter l or r)? ");
	scanf("%c", &shiftDirection);
	getchar();
	tolower(shiftDirection);
	while (shiftDirection != 'l' &&
		shiftDirection != 'r')
	{
		printf("\n");
		printf("Shift can only be left or right\n");
		printf("Left or right shift (enter l or r)? ");
		scanf("%c", &shiftDirection);
		getchar();
		tolower(shiftDirection);
	}

	return shiftDirection;
}

/*
* Gets a valid shift amount between 1 and 25 inclusive
*/
int getValidShiftAmount()
{
	int shiftAmount;

	// prompt for and get valid shift amount
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

	return shiftAmount;
}

/*
* Gets a valid message to be encrypted from the user
*/
void getValidMessage(char* message, int messageSize)
{
	// prompt for and get valid string to be encrypted
	bool validMessage = false;
	printf("\n");
	printf("Enter message to be encrypted (upper case alphabetic characters only): ");
	fgets(message, messageSize, stdin);
	int messageLength = strnlen(message, messageSize) - 1;
	while (!validMessage)
	{
		// invalid if non-upper case alpha characters in message (don't include newline at end))
		validMessage = true;
		for (int i = 0; i < messageLength; i++)
		{
			if (!isupper(message[i]))
			{
				printf("\n");
				printf("Message must contain only upper case alphabetic characters!\n");
				printf("Enter message to be encrypted (upper case alphabetic characters only): ");
				fgets(message, messageSize, stdin);
				messageLength = strnlen(message, messageSize) - 1;

				// reset flag and exit for loop
				validMessage = false;
				break;
			}
		}
	}
	message[messageLength] = '\0';
}

/*
* Encrypts the given message
*/
char* encryptMessage(char* message, int messageSize,
	bool leftShift, int shiftAmount)
{
	// build encrypted string (make sure it's null-terminated)
	// Note that we have to use pointers here to dynamically
	// allocate the encryptedMessage array in Visual Studio
	char* encryptedMessage = malloc((messageSize + 1) * sizeof(char));
	for (int i = 0; i < messageSize; i++)
	{
		if (leftShift)
		{
			encryptedMessage[i] = message[i] - shiftAmount;
			if (encryptedMessage[i] < 'A')
			{
				encryptedMessage[i] += 'Z' - 'A' + 1;
			}
		}
		else
		{
			encryptedMessage[i] = message[i] + shiftAmount;
			if (encryptedMessage[i] > 'Z')
			{
				encryptedMessage[i] -= 'Z' - 'A' + 1;
			}
		}
	}
	encryptedMessage[messageSize] = '\0';
	return encryptedMessage;
}

/*
* Decrypts the given message
*/
char* decryptMessage(char* message, int messageSize,
	bool leftShift, int shiftAmount)
{
	// build decrypted string (make sure it's null-terminated)
	// Note that we have to use pointers here to dynamically
	// allocate the decryptedMessage array in Visual Studio
	char* decryptedMessage = malloc((messageSize + 1) * sizeof(char));
	for (int i = 0; i < messageSize; i++)
	{
		if (leftShift)
		{
			decryptedMessage[i] = message[i] + shiftAmount;
			if (decryptedMessage[i] > 'Z')
			{
				decryptedMessage[i] -= 'Z' - 'A' + 1;
			}
		}
		else
		{
			decryptedMessage[i] = (message[i] - shiftAmount);
			if (decryptedMessage[i] < 'A')
			{
				decryptedMessage[i] += 'Z' - 'A' + 1;
			}
		}
	}
	decryptedMessage[messageSize] = '\0';
	return decryptedMessage;
}