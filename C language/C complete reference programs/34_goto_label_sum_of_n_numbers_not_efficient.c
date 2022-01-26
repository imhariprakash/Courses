#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    int n,i=0,sum=0;
    printf("Enter the number: ");
    scanf("%d",&n);
    start1:
    i++;
    sum+=i;
    if(i<n)
    {
        goto start1;
    }
    printf("Sum is : %d\n",sum);
}