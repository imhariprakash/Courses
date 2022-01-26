#include<stdio.h>

int squareNum(int num)
{
    num=num*num;
    return num;
}

int main()
{
    int num;
    printf("Enter the number: ");
    scanf("%d",&num);
    printf("%d is the square of %d.\n",squareNum(num),num);  //pass by value so num not changed
    return 0;
}