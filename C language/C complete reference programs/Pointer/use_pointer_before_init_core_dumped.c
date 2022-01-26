#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *x,y=10;
    printf("%p %d\n",x,*x); //error core dumped
}