/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

float averageScores(int firstScore, int secondScore);
float averageScoreArray(int scores[], int count);

/*
* Demonstrates functions with parameters
*/
int main(int argc, char** argv)
{
	int score1 = 100;
	int score2 = 99;
	int scores[] = { 98, 99, 100 };
	//int scores[5] = { 98, 99, 100, 0, 0 };

	// calculate and print average of two scores
	float averageScore = averageScores(score1, score2);
	printf("Average of %d and %d: %.2f\n", score1, score2, 
		averageScore);

	// calculate and print average of scores array
	printf("Average of scores in array: %.2f\n", 
		averageScoreArray(scores, sizeof(scores) / sizeof(scores[0])));
	/*printf("Average of scores in array: %.2f\n",
		averageScoreArray(scores, 3));*/

	return (EXIT_SUCCESS);
}

/*
* Averages two scores
*/
float averageScores(int firstScore, int secondScore)
{
	return (float)(firstScore + secondScore) / 2;
}

/*
* Averages the scores in an array
*/
float averageScoreArray(int scores[], int count)
{
	int sum = 0;
	for (int i = 0; i < count; i++)
	{
		sum += scores[i];
	}
	return (float)sum / count;
}