#include<stdio.h>
#include<stdlib.h>

int main()
{
    int count=10;
    int* ptr=&count;
    printf("Address of count = %p\n",ptr);
    printf("Value of ptr = %d\n",*ptr);
    printf("Value of count before changing ptr = %d\n",count);
    *ptr=*ptr+5;
    printf("Value of count after changing ptr = %d\n",count);
}