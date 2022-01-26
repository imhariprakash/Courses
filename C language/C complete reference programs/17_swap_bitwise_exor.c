#include<stdio.h>
#include<stdlib.h>

void swap(int* a,int* b)
{
    *a=*a ^ *b;
    *b=*a ^ *b;
    *a=*a ^* b;
}

int main()
{
    int a,b;
    printf("Enter the number: ");
    scanf("%d",&a);
    printf("Enter the number: ");
    scanf("%d",&b);
    swap(&a,&b);
    printf("Number 1: %d",a);
    printf("\nNumber 2: %d\n",b);
}