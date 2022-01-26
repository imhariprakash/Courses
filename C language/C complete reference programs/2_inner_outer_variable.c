#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x=10;
    if(x==10)
    {
        int x=9;
        printf("Inner x: %d\n",x);
    }
    printf("Outer x: %d\n",x);
}