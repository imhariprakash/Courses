/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

#include <string.h>
#include <ctype.h>
#include <stdbool.h>

#define SHIFT_AMOUNT 5

/*
* Implement Caesar Cipher Right Shift 5 encryption and decryption
*/
int main(int argc, char** argv)
{
	char originalMessage[100];

	// prompt for and get valid string to be encrypted
	bool validMessage = false;
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
	//char encryptedMessage[originalMessageLength + 1];
	// Visual Studio users can't create arrays with sizes based on user
	// input because of the compiler Visual Studio uses
	char* encryptedMessage = malloc((originalMessageLength + 1) * sizeof(char));
	for (int i = 0; i < originalMessageLength; i++)
	{
		encryptedMessage[i] = originalMessage[i] + SHIFT_AMOUNT;
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
	encryptedMessage[originalMessageLength] = '\0';

	// build decrypted string (make sure it's null-terminated)
	//int encryptedMessageLength = strnlen(encryptedMessage, sizeof(encryptedMessage));
	//char decryptedMessage[encryptedMessageLength + 1];
	// Visual Studio users can't create arrays with sizes based on user
	// input because of the compiler Visual Studio uses
	int encryptedMessageLength = originalMessageLength;
	char* decryptedMessage = malloc((encryptedMessageLength + 1) * sizeof(char));
	for (int i = 0; i < encryptedMessageLength; i++)
	{
		decryptedMessage[i] = encryptedMessage[i] - SHIFT_AMOUNT;
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
	decryptedMessage[encryptedMessageLength] = '\0';

	// print messages
	printf("\n");
	printf("Original Message : %s", originalMessage);
	printf("Encrypted Message: %s\n", encryptedMessage);
	printf("Decrypted Message: %s\n", decryptedMessage);

	// Visual Studio: free memory because we used pointers
	free(encryptedMessage);
	encryptedMessage = NULL;
	free(decryptedMessage);
	decryptedMessage = NULL;

	printf("\n");
	return (EXIT_SUCCESS);
}

