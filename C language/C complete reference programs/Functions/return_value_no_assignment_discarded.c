#include<stdio.h>

int squareNum(int num)
{
    int x=num;
    x=x*x;
    return x;
}

int main()
{
    int x;
    printf("Enter the number: ");
    scanf("%d",&x);
    squareNum(x); //Though it has return value we are not assigning so the returned value is just discarded.
    printf("%d\n",x);
}