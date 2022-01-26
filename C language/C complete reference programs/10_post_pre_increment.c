#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a=10,x=10,b,y;
    b=a++;
    printf("post increment: %d  %d\n",a,b);
    y=++x;
    printf("pre increment: %d  %d\n",x,y);
}