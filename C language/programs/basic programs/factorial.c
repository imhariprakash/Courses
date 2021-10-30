#include<stdio.h>
int factorial(int n)
{
    if(n==0 || n==1)
        return(1);
    else
        return(n*factorial(n-1));
}
int main(){
    int n,fact;
    printf("Enter the number: ");
    scanf("%d",&n);
    if(n<0)
    {
        printf("\nNumber must be positive.\n");
        return 0;
    }
    fact=factorial(n);
    printf("\nFactorial of %d is %d.\n",n,fact);
    return 0;
}
