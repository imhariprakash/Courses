/*
Write a C program to trim leading white space characters from a given string using loop. How to remove leading white space characters from a given string using loop in C programming. Logic to remove leading/starting blank spaces from a given string in C programming.
Example
Input
Input string:       Lots of leading space.
Output
String after removing leading white spaces: 
Lots of leading space.
*/



#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void remove_whitespace(char array[], int *n, int start, int count){
    int i;
    for(i =(start + count); i < *n; i++)
    {
        array[i-count] = array[i];
    }
    array[i-count] = '\0';
    (*n) = (*n) - count;
}

void findSpace(char array[], int *n)
{
    int i = 0, count = 0;
    for(i = 0; i < *n; i++)
    {
        if(array[i] == ' ' || array[i] == '\t' || array[i] == '\n')
        {
            count++;
        }
        else
        { 
            break;
        }
    }
    printf("%d\n",count);
    remove_whitespace(array, n, 0, count);
}

int main()
{
    char array[100];
    printf("Enter the string: ");
    fgets(array,sizeof(array),stdin);
    int n = strlen(array);
    if(array[0] == ' ' || array[0] == '\t' || array[0] == '\n')
    {
        findSpace(array, &n);
    }

    for(int i=0;array[i] != '\0'; i++)
    {
        if(array[i] == ' ' || array[i] == '\t' || array[i] == '\n')
        {
            if(array[i+1] == '.' || array[i+1] == '!' || array[i+1] == '?' || array[i] == ',')
            {
                findSpace(&array[i], &n);
            }

            else if(array[i+1] == ' ' || array[i+1] == '\t' || array[i+1] == '\n')
            {
                findSpace(&array[i+1], &n);
            }
        }
    }
    printf("%s\n",array);
}