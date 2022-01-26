#include<stdio.h>
#include<stdlib.h>

int power(register int a,register int b)
{
    register int temp=1;
    for( register int i=0;i<b;i++)
    {
        temp=temp*a;
    }
    return temp;
}

int main()
{
    int a,b,c;
    printf("Enter the base: ");
    scanf("%d",&a);
    printf("Enter the power: ");
    scanf("%d",&b);
    c=power(a,b);
    printf("The answer is %d.\n",c);
}