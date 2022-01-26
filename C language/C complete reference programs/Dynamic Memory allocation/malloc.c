#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main()
{
    char *ptr;
    int i;
    ptr=malloc(100*sizeof(char));
    fgets(ptr,100,stdin);
    printf("%s\n",ptr);
    for(i=strlen(ptr)-1;i>=0;i--)
    {
        printf("%c",ptr[i]);
    }
}