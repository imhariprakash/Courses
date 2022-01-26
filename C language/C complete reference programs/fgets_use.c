#include<stdio.h>
#include<stdlib.h>

int main()
{
    char array[40];
    int i;
    for(i=0;i<10;i++)
    {
        printf("Enter the string: ");
        fgets(array,40,stdin);
        printf("%s\n",array);
    }
}