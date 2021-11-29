/*
 * File:   main.c
 * Author: <your name here>
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LENGTH 100

typedef struct Card Card;
struct Card
{
	int rank;
	int suit;
};

typedef struct LinkedList LinkedList;
struct LinkedList
{
	Card data;
	LinkedList *next;
};
LinkedList *head;
LinkedList *tail;

void buildLinkedListFromString(char string[]);
void addNodeToList(LinkedList **headPointer, LinkedList **tailPointer,
	LinkedList *node);
LinkedList *getCardNode(char string[], int spaceIndex);
Card extractCardFromString(char string[], int length);
Card getCard();

/*
 * An Array of Cards Programming Assignment
 */
int main(int argc, char** argv)
{
	// IMPORTANT: Only add code in the section
	// indicated below. The code I've provided
	// makes your solution work with the 
	// automated grader on Coursera
	char input[MAX_LENGTH];
	fgets(input, MAX_LENGTH, stdin);
	while (input[0] != 'q')
	{
		buildLinkedListFromString(input);

		// Add your code between this comment
		// and the comment below. You can of
		// course add more space between the
		// comments as needed

		// fill hand
		Card hand[5];
		for (int i = 0; i < 5; i++)
		{
			hand[i] = getCard();
		}

		// count suits
		int numClubs = 0;
		int numDiamonds = 0;
		int numHearts = 0;
		int numSpades = 0;
		for (int i = 0; i < 5; i++)
		{
			if (hand[i].suit == 'C')
			{
				numClubs++;
			}
			else if (hand[i].suit == 'D')
			{
				numDiamonds++;
			}
			else if (hand[i].suit == 'H')
			{
				numHearts++;
			}
			else
			{
				numSpades++;
			}
		}

		// print results
		printf("C %d D %d H %d S %d\n",
			numClubs, numDiamonds, numHearts, numSpades);

		// Don't add or modify any code below
		// this comment
		fgets(input, MAX_LENGTH, stdin);
	}

	return 0;
}

/*
* Builds a linked list of cards from provided string
*/
void buildLinkedListFromString(char string[])
{
	// find first space in string
	int spaceIndex = -1;
	char *result = NULL;
	result = strchr(string, ' ');
	char *stringStart = &string[0];

	// loop while there are more spaces in string
	while (result != NULL)
	{
		spaceIndex = result - stringStart;

		// build new node and add to list
		LinkedList *node = getCardNode(stringStart, spaceIndex);
		addNodeToList(&head, &tail, node);

		// find next space in string
		string = &string[0] + spaceIndex + 1;
		result = strchr(string, ' ');
		stringStart = &string[0];
	}

	// add final node to list
	LinkedList *node = getCardNode(stringStart, 
		strlen(stringStart));
	addNodeToList(&head, &tail, node);
}

/*
* Adds a node to the linked list
*/
void addNodeToList(LinkedList **headPointer, LinkedList **tailPointer,
	LinkedList *node)
{
	// add node to linked list
	if (*headPointer == NULL)
	{
		// adding to empty list
		*headPointer = node;
	}
	else
	{
		// add to end of list
		(*tailPointer)->next = node;
	}
	*tailPointer = node;
}

/*
* Gets a node for a Card
*/
LinkedList *getCardNode(char string[], int length)
{
	// extract card from string
	Card value = extractCardFromString(string, length);

	// build and return node
	LinkedList *node;
	node = malloc(sizeof(struct LinkedList));
	node->data = value;
	node->next = NULL;
	return node;
}

/*
* Extracts a card struct from the given string
*
* We know the string format is always 3 characters
* long: r,s (rank,suit)
*/
Card extractCardFromString(char string[], int length)
{
	// extract card string from string
	char* cardString = malloc((length + 1) * sizeof(char));
	strncpy(cardString, string, length);
	cardString[length] = '\0';

	// build Card struct
	Card *cardInfo = malloc(sizeof(Card));
	cardInfo->rank = cardString[0];
	cardInfo->suit = cardString[2];

	// free memory and return card
	free(cardString);
	cardString = NULL;
	return *cardInfo;
}

/*
* Get a card from the linked list. If the linked
* list is null, the returned card has q values
* for both rank and suit
*/
Card getCard()
{
	// check for empty list
	Card value;
	if (head != NULL)
	{
		// save value at front of list
		value = head->data;
		
		// move along list
		LinkedList *temp = head;
		head = head->next;
		free(temp);
	}
	else
	{
		// empty list
		Card *qCard = malloc(sizeof(Card));
		qCard->rank = 'Q';
		qCard->suit = 'Q';
		value = *qCard;
	}
	return value;
}
