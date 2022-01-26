#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *file;
    char str[100];
    file=fopen("rewind_exer.txt","r");

    for(int i=0; i<7; i++)
    {
        fgets(str,sizeof(str),file);
        printf("%s",str);
    }

    rewind(file);

    printf("\nAfter rewind: \n\n");

    for(int i=0; i<7; i++)
    {
        fgets(str,sizeof(str),file);
        printf("%s",str);
    }

    
}