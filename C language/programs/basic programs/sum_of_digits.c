#include<stdio.h>
int sum_digits(int n)
{
    if(n==0)
        return 0;
    else
        return((n%10)+sum_digits(n/10));
}
int main()
{
    int n,ans;
    printf("Enter the number: ");
    scanf("%d",&n);
    if(n<0)
        n=-1*n;
    ans=sum_digits(n);
    printf("\nThe sum of all the digits of %d is %d.\n",n,ans);
    return 0;
}
