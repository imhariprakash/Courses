#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct
{
    int a;
    int b;
    int c;
}var;

void printvar(var *num)
{
    printf("%d %d %d\n",num->a,num->b,num->c);
}

int main()
{
    // var num={1,2,3};
    // printf("%d %d %d\n",num.a,num.b,num.c);

    var num={1,2,3},*num1;
    num1=&num;
    num1->c=10;
    printvar(num1);

    /*  error - var is like int - type name specifier - cant use as an structure object here
    var *num;
    var.a=1;
    var.b=2;
    var.c=3;
    num=&var;
    printvar(num);

    */

   // instead use like this example - use struct tag and variables
    //printf("%d %d %d\n",num.a,num.b,num.c);
}