/*
 * File:   main.c
 * Author: <your name here>
 */

#define _CRT_SECURE_NO_WARNINGS
 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_LENGTH 100

/*
 * Junior Codebreaker Programming Assignment
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
		// Add your code between this comment
		// and the comment below. You can of
		// course add more space between the
		// comments as needed
		int l = strlen(input)-1; 

		int i; 

		char  count[27] ="abcdefghijklmnopqrstuvwxyz"; 
            for(int j =0; j <26 ; j++) 
            { 
                int temp=0; 
                for( i =0; i < l; i++) 
                { 
                    input[i]=tolower(input[i]); 
                    if(input[i]==count[j]) 
                        temp++; 
                } 
                    if(temp != 0) 
                    { 
                        count[j]=toupper(count[j]); 
                        printf("%c%d " ,count[j],temp); 
                    } 
            } 
            printf("\n"); 


		// Don't add or modify any code below
		// this comment
		fgets(input, MAX_LENGTH, stdin);
	}

	return 0;
}
