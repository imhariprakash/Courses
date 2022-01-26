#include<stdio.h>

int swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}

int main()
{
    int a,b;
    printf("Enter a: ");
    scanf("%d",&a);
    printf("Enter b: ");
    scanf("%d",&b);
    printf("Before swapping a = %d and b= %d\n",a,b);
    swap(&a,&b);
    printf("After swapping a = %d and b = %d\n",a,b);
    return 0;
}