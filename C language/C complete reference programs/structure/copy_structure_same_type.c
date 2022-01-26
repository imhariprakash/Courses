#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct
{
    int a,b;
}var;

int main()
{
    var x,y;
    x.a=10;
    x.b=11;
    y=x;
    printf("%d %d %d %d\n",x.a,x.b,y.a,y.b);
}