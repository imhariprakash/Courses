#include<stdio.h>

int main()
{
    int a=10;
    int *b=&a;
    printf("%p\n%p\n",b++,b--);
}