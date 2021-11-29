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

#define SHIFT_AMOUNT 5

char* encryptMessage(char* message, int messageSize);
char* decryptMessage(char* message, int messageSize);

/*
* Implement Caesar Cipher Right Shift 5 encryption and decryption
*/
int main(int argc, char** argv)
{
	int numLines = 0;
	char originalMessage[100];

	// open file for reading
	FILE *inputFile = fopen("original.txt", "r");
	if (inputFile == NULL)
	{
		printf("Original file open failed\n");
		return (EXIT_FAILURE);
	}

	// count lines in file
	while (!feof(inputFile))
	{
		fgets(originalMessage, sizeof(originalMessage), inputFile);
		numLines++;
	}

	// open encrypted message file
	FILE *encryptedFile = fopen("encrypted.txt", "w");
	if (encryptedFile == NULL)
	{
		printf("Encrypted file open failed\n");
		return (EXIT_FAILURE);
	}

	// rewind file and encrypt messages from file
	rewind(inputFile);
	int originalMessageLength;
	int stringLengthAdjustment = 0;
	for (int i = 0; i < numLines; i++)
	{
		fgets(originalMessage, sizeof(originalMessage), inputFile);
		
		// check for \n and set original message length
		char* result = strchr(originalMessage, '\n');
		if (result == NULL)
		{
			stringLengthAdjustment = 0;
		}
		else
		{
			stringLengthAdjustment = 1;
		}
		originalMessageLength = strnlen(originalMessage, sizeof(originalMessage)) - 
			stringLengthAdjustment;
		char* encryptedMessage = encryptMessage(originalMessage,
			originalMessageLength);
		fprintf(encryptedFile, "%s\n", encryptedMessage);

		// good pointer use
		free(encryptedMessage);
		encryptedMessage = NULL;
	}

	// close original and encrypted files
	fclose(inputFile);
	fclose(encryptedFile);

	// open encrypted file for reading
	encryptedFile = fopen("encrypted.txt", "r");
	if (encryptedFile == NULL)
	{
		printf("Encrypted file open failed\n");
		return (EXIT_FAILURE);
	}

	// open decrypted message file
	FILE *decryptedFile = fopen("decrypted.txt", "w");
	if (decryptedFile == NULL)
	{
		printf("Decrypted file open failed\n");
		return (EXIT_FAILURE);
	}

	// decrypt messages from file
	char encryptedMessage[100];
	int encryptedMessageLength;
	for (int i = 0; i < numLines; i++)
	{
		fgets(encryptedMessage, sizeof(encryptedMessage), encryptedFile);
		encryptedMessageLength = strnlen(encryptedMessage, sizeof(encryptedMessage)) - 1;
		char* decryptedMessage = decryptMessage(encryptedMessage,
			encryptedMessageLength);
		fprintf(decryptedFile, "%s\n", decryptedMessage);

		// good pointer use
		free(decryptedMessage);
		decryptedMessage = NULL;
	}

	// close encrypted and decrypted files
	fclose(encryptedFile);
	fclose(decryptedFile);
	printf("\n");
	return (EXIT_SUCCESS);
}

/*
* Encrypts the given message using Right Shift 5 encryption
*/
char* encryptMessage(char* message, int messageSize)
{
	// build encrypted string (make sure it's null-terminated)
	char* encryptedMessage = malloc((messageSize + 1) * sizeof(char));
	for (int i = 0; i < messageSize; i++)
	{
		encryptedMessage[i] = message[i] + SHIFT_AMOUNT;
		if (encryptedMessage[i] > 'Z')
		{
			encryptedMessage[i] -= 'Z' - 'A' + 1;
			// Example: encrypting 'V' at 86 in table
			// '[' is at 91 in table ('Z' is at 90 in table)
			// 'Z' is 90, 'A' is 65, so 'Z' - 'A' + 1 is 26
			// '[' is changed from 91 to 91 - 26, which is 65 ('A')
			// this gives us exactly the wrapping we need
		}
	}
	encryptedMessage[messageSize] = '\0';

	return encryptedMessage;
}

/*
* Decrypts the given message using Right Shift 5 decryption
*/
char* decryptMessage(char* message, int messageSize)
{
	// build decrypted string (make sure it's null-terminated)
	char* decryptedMessage = malloc((messageSize + 1) * sizeof(char));
	for (int i = 0; i < messageSize; i++)
	{
		decryptedMessage[i] = message[i] - SHIFT_AMOUNT;
		if (decryptedMessage[i] < 'A')
		{
			decryptedMessage[i] += 'Z' - 'A' + 1;
			// Example: decrypting 'E' at 69 in table
			// '@' is at 64 in table ('A' is at 65 in table)
			// 'Z' is 90, 'A' is 65, so 'Z' - 'A' + 1 is 26
			// '@' is changed from 64 to 64 + 26, which is 90 ('Z')
			// this gives us exactly the wrapping we need
		}
	}
	decryptedMessage[messageSize] = '\0';

	return decryptedMessage;
}