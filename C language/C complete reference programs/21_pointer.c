#include<stdio.h>
#include<stdlib.h>

int main()
{
    int* a;
    int count=10,b;
    a=&count;
    printf("%p",a);
    b=*a;
    printf("\ncount: %d\nb: %d\n",count,b);
    count++;
    printf("\ncount: %d\nb: %d\n",count,b);
    *a=*a+1;
    printf("\ncount: %d\nb: %d\n",count,b);
}