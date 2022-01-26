#include<stdio.h>
#include<stdlib.h>

typedef union
{
    int a;
    int b;
    char c;
    double d;
}vari;

int main()
{
    vari var;
    var.a=1;
    var.b=11;
    var.c='a';
    var.d=111.002;
    printf("%d %d %c %lf\n",var.a,var.b,var.c,var.d);
}