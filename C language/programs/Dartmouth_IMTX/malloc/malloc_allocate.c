#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *num1,*num2;
    num1=malloc(sizeof(int));
    num2=malloc(sizeof(int));
    *num1=100;
    *num2=200;
    printf("%d %d",*num1,*num2);
    printf("\n%p %p",num1,num2);
}