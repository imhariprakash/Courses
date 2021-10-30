#include<stdio.h>
int main()
{
    int n,i,j,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    for(i=n;i>=1;i--)
    {
        for(k=n-i;k>0;k--)
        printf(" ");
        for(j=(2*i)-1;j>0;j--)
        {
            printf("*");
        }
        printf("\n");
    }
}
