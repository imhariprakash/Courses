#include<stdio.h>

int main()
{
    int a=5;
    a=a+++a;
    printf("%d  ",a);
    a=5;
    int b=a+ ++a;
    printf("%d\n",b);

    int c=printf("Hello") + printf("World\n");
    printf("%d",c);
}