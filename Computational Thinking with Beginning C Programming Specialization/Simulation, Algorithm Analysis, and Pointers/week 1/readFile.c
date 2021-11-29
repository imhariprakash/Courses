#include<stdio.h>
#include<stdlib.h>
int main()
{
    FILE *inputfile=fopen("hello.txt","r");
    char current[100];
    int count=0;
    if(inputfile==NULL)
    {
        printf("File not opening!\n");
        return(EXIT_FAILURE);
    }
    while(!feof(inputfile))
    {
        fgets(current,100,inputfile);
        count++;
    }
    rewind(inputfile);
}