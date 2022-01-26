#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a=1,b=2;
    int *ptr1=&a,*ptr2=&b;
    printf("%ld  %ld\n",(long int)ptr1,(long int)ptr2);
    if(ptr1 > ptr2)
    {
        printf("Hurrah ptr1\n");
    }
    else
    {
        printf("Hurrah ptr2\n");
    }
}