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
    printf("\n%p %p\n",num1,num2);
    free(num1);
    free(num2);
    int *num3,*num4;
    num3=malloc(sizeof(int));
    num4=malloc(sizeof(int));
    *num3=1000;
    *num4=2000;
    printf("num1: %d, num2: %d, num3: %d, num4: %d",*num1,*num2,*num3,*num4);
    printf("\n%p %p %p %p",num1,num2,num3,num4);
    free(num1);
    free(num2);
}