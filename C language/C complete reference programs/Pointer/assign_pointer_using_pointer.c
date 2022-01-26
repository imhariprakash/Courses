#include<stdio.h>
#include<stdlib.h>

int main()
{
    int count=10;
    int *ptr1,*ptr2;
    ptr1=&count;
    ptr2=ptr1;
    printf("Pointer 1 : %d\nPointer 2 : %d\n",*ptr1,*ptr2);
}