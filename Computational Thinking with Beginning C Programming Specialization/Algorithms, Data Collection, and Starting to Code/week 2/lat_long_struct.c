/*
* File:   main.c
* Author: Dr. T
*/

#include <stdio.h>
#include <stdlib.h>

/*
* Exercise 5 Solution
*/
int main(int argc, char** argv)
{
	// Problem 1: Define type for GPS coordinates
	typedef struct GpsCoordinates GpsCoordinates;
	struct GpsCoordinates
	{
		float latitude;
		float longitude;
	};

	// Problem 2: Declare and initialize variables
	GpsCoordinates uccs = { 38.8936471f, -104.8003126f };
	GpsCoordinates london;
	london.latitude = 51.5073509f;
	london.longitude = -0.1277583f;

	// Problem 3: Print latitude and longitude differences
	// NOTE: Doing the subtraction in either order is fine.
	// My solution puts the place I want to visit first so I
	// can see how I'd have to change my latitude and longitude
	// to get from where I am to where I want to visit
	printf("Latitude needs to change by %f to get from UCCS to London\n",
		london.latitude - uccs.latitude);
	printf("Longitude needs to change by %f to get from UCCS to London\n",
		london.longitude - uccs.longitude);

	return (EXIT_SUCCESS);
}

