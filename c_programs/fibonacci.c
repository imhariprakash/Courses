#include<stdio.h>
int fibonacci(int n)
{
    if(n==1)
        return 0;
    else if(n==2)
        return 1;
    else
        return(fibonacci(n-1)+fibonacci(n-2));
}
int main()
{
    int n,ans;
    printf("Which term of fibonaaci series do you want ? : ");
    scanf("%d",&n);
    if(n<1)
    {
        printf("\nInput must be equal to or greater than 1.\n");
        return 0;
    }
    ans=fibonacci(n);
    printf("\nThe %d th term of the fibonacci series is %d.\n",n,ans);
    return 0;
}
