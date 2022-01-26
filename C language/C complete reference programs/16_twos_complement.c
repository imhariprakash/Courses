#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,a;
    printf("Enter the number: ");
    scanf("%d",&n);
    a=(~n)+1;
    printf("The two's complement of %d is : %d\n",n,a);
    return 0;
}
