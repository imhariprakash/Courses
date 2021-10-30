#include<stdio.h>
void swap(int *a,int *b)
{
int temp;
temp=*a;
*a=*b;
*b=temp;
}
int main()
{
int a,b;
printf("Enter the number: ");
scanf("%d",&a);
printf("Enter the number: ");
scanf("%d",&b);
swap(&a,&b);
printf("The swapped values are %d and %d.",a,b);
return 0;
}
