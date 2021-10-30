#include<stdio.h>
void add_3(int *a)
{
*a=*a+3;
}
int main()
{
int a;
printf("Enter the number: ");
scanf("%d",&a);
add_3(&a);
printf("The swapped values are %d.",a);
return 0;
}
