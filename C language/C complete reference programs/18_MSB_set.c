#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int n,a;
    printf("Enter the number: ");
    scanf("%d",&n);
    a=round(log2f(n));
    n=(n>>(a-1))&1;
    if(n)
        printf("MSB Set");
    else
        printf("MSB Unset");
}