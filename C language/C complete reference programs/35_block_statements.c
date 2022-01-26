#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>

int main()
{
    int i=10;
    
    {
        i=1020;
        printf("%d\n",i);
    }
    
    printf("%d\n",i);
}