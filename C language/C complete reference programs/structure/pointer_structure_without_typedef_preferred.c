#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct myvar
{
    int a;
    int b;
    int c;
}var;

void printvar(struct myvar *num)
{
    printf("%d %d %d\n",num->a,num->b,num->c);
}

int main()
{
    struct myvar *num;
    num=&var;
    num->a=1;
    num->b=2;
    num->c=3;
    printvar(num);
}