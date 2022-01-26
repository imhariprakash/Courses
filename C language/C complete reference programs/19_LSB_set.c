#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    n=n&1;
    if(n)
        printf("LSB Set");
    else
        printf("LSB Unset");
}