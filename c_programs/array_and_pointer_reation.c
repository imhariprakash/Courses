#include <stdio.h>

#include<stdio.h>
int main()
{
int a[]={1,2,3,4,5,6};
int *ptr=&a[0],*ptr1;
ptr1=&a[0];
printf("%d",*ptr);
printf("\n%d",*ptr1);
}

