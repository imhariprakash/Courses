#include<stdio.h>

int main()
{
    int a,b,c;
    printf("Enter%n the number: ",&b);
    scanf("%d%n",&a,&c);
    printf("The number given as input: %d\nThe count from printf: %d\nThe count from scanf: %d\n",a,b,c);

}