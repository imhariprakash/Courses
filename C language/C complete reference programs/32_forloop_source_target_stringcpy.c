#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void copyString(char* target,char* source)
{
    int i,j;
    printf("%s\n",target);
    for(i=0,j=strlen(target);j>=i;i++,j--)
    {
        target[i]=source[i];
        target[j]=source[j];
        printf("%s\n",target);
    }
}

int main()
{
    char target[80]="********************************";
    copyString(target,"This is a test of convergence().");
    printf("Final string: %s\n",target);
}