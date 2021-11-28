/*
 * File:   main.c
 * Author: Dr. T
 */

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#include <math.h>

#define TIME_TO_MOVE 3

// needed to add this for Visual Studio
#ifndef M_PI
	#define M_PI 3.14159265358979323846
#endif

 /*
  * Calculates speed and direction
  */
int main(int argc, char** argv)
{
	float pointOneX;
	float pointOneY;
	float pointTwoX;
	float pointTwoY;

	// prompt for and get user input
	printf("Enter x for first point: ");
	scanf("%f", &pointOneX);
	printf("Enter y for first point: ");
	scanf("%f", &pointOneY);
	printf("Enter x for second point: ");
	scanf("%f", &pointTwoX);
	printf("Enter y for second point: ");
	scanf("%f", &pointTwoY);
	printf("\n");

	// calculate distance, speed, and direction between the two points
	float deltaX = pointTwoX - pointOneX;
	float deltaY = pointTwoY - pointOneY;
	float distance = sqrtf(powf(deltaX, 2) + powf(deltaY, 2));
	float speed = distance / TIME_TO_MOVE;
	float direction = atan2f(deltaY, deltaX);
	direction *= 180 / M_PI;

	// print out speed and direction between two points
	printf("Speed: %.2f\n", speed);
	printf("Direction: %.2f degrees\n", direction);

    printf("\n");
	return (EXIT_SUCCESS);
}
