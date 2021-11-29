/*
* File:   main.c
* Author: Dr. T
*/

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define NUM_STUDENTS 3

typedef struct Student Student;
struct Student
{
	int number;
	float percent;
	char grade;
};

int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound);
float getValidFloat(char promptString[], char errorString[],
	float lowerBound, float upperBound);
char getValidChar(char promptString[], char errorString[],
	char validValues[], int count);
bool isValid(char character, char validValues[], int count);
void getValidStudentData(Student *student, char validValues[], int count);
void writeStudentToFile(Student student, FILE *file);

/*
* Gets student data and saves the data to a file
*/
int main(int argc, char** argv)
{
	Student students[NUM_STUDENTS];
	char validGrades[] = { 'A', 'B', 'C', 'D', 'F' };

	// read in student data
	for (int i = 0; i < NUM_STUDENTS; i++)
	{
		getValidStudentData(&students[i], validGrades,
			sizeof(validGrades) / sizeof(validGrades[0]));
	}

	// open file for writing
	FILE *outputFile = fopen("data.txt", "w");
	if (outputFile == NULL)
	{
		printf("File open failed\n");
		return(EXIT_FAILURE);
	}

	// write student data to file
	for (int i = 0; i < NUM_STUDENTS; i++)
	{
		writeStudentToFile(students[i], outputFile);
	}

	// close file
	fclose(outputFile);

	printf("\n");
	return (EXIT_SUCCESS);
}

/*
* Get valid integer input from user
*/
int getValidInteger(char promptString[], char errorString[],
	int lowerBound, int upperBound)
{
	int input;

	// prompt for and get input
	printf(promptString);
	scanf("%d", &input);

	// validate input
	while (input < lowerBound || input > upperBound)
	{
		printf("\n");
		printf(errorString);
		printf("\n");
		printf(promptString);
		scanf("%d", &input);
	}

	return input;
}

/*
* Get valid float input from user
*/
float getValidFloat(char promptString[], char errorString[],
	float lowerBound, float upperBound)
{
	float input;

	// prompt for and get input
	printf(promptString);
	scanf("%f", &input);

	// validate input
	while (input < lowerBound || input > upperBound)
	{
		printf("\n");
		printf(errorString);
		printf("\n");
		printf(promptString);
		scanf("%f", &input);
	}

	return input;
}

/*
* Get valid char input from user
*/
char getValidChar(char promptString[], char errorString[],
	char validValues[], int count)
{
	char input;

	// prompt for and get input
	printf(promptString);
	scanf("%c", &input);

	// validate input
	while (!isValid(input, validValues, count))
	{
		printf("\n");
		printf(errorString);
		printf("\n");
		printf(promptString);
		scanf("%c", &input);
	}

	return input;
}

/*
* Checks whether or not the given character is contained
* in the set of valid values
*/
bool isValid(char character, char validValues[], int count)
{
	for (int i = 0; i < count; i++)
	{
		if (character == validValues[i])
		{
			return true;
		}
	}
	return false;
}

/*
* Get valid student data
*/
void getValidStudentData(Student *student, char validValues[], int count)
{
	student->number = getValidInteger("Enter 9-digit student number: ",
		"Student number must be 9 digits", 0, 999999999);
	student->percent = getValidFloat("Enter percentage (0-100): ",
		"Percentage must be between 0 and 100", 0, 100);
	getchar();
	student->grade = getValidChar("Enter letter grade (A, B, C, D, or F): ",
		"Letter grade must be A, B, C, D, or F", validValues, count);
}

/*
* Writes student data to a file
*/
void writeStudentToFile(Student student, FILE *file)
{
	fprintf(file, "%09d,%.2f,%c\n", student.number,
		student.percent, student.grade);
}