#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[100][80];
    int i=0;
    fgets(str[i],80,stdin);
    while(*str[i] !='\n')
    {
        i++;
        fgets(str[i],80,stdin);
    }
    i=0;
    while(*str[i] != '\n')
    {
        printf("%s",str[i]);
        i++;
    }
}