#include<stdio.h>
#include<stdlib.h>

int main()
{
    FILE *file;
    file=fopen("fprintf_fscanf.txt","a");
    char str[100];
    fscanf(stdin,"%s",str);
    fprintf(file,"%s\n",str);
    fclose(file);
}