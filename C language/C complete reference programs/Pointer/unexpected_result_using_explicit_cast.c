#include<stdio.h>
#include<stdlib.h>

int main()
{
    double a=111.1,b;
    int *c=(int*)&a;
    printf("%d\n",*c);
}