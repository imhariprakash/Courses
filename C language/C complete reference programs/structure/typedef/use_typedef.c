#include<stdio.h>
#include<stdlib.h>

typedef int hello;
typedef hello world;

int main()
{
    hello var1;
    world var2;
    printf("Enter 1: ");
    scanf("%d",&var1);
    printf("Enter 2: ");
    scanf("%d",&var2);
    printf("%d %d\n",var1,var2);
}