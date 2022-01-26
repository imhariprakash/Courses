#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,count=0;
    printf("Enter the number: ");
    scanf("%d",&n);
    while(n>0)
    {
        count++;
        n=n>>1;
    }

    printf("The number of bits required is: %d.",count);
}
