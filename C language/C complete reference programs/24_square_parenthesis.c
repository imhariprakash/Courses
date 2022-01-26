#include<stdio.h>
#include<stdlib.h>

struct employee{
    char name[80];
    int age;
    float wage;
}emp;

int main()
{
    int a,b;
    char c[20]="Tony";
    a=1+2*3;
    b=(1+2)*3;
    printf("char: %c\na: %d\nb: %d\n",c[0],a,b);
}
    