#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i,j,n;
    printf("Enter the number: ");
    scanf("%d",&n);
    printf("\n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++)
        {
            printf("%d ",j+1);
        }

        for(j=0;j<(2*(n-i-1));j++)
        {
            printf("  ");
        }

        for(j=i+1;j>=1;j--)
        {
            printf("%d ",j);
        }

        printf("\n");
    }
}