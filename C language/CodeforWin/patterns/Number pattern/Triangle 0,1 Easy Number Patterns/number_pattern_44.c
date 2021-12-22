#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        for(j=1;i>=3 && j<=i-2;j++)
        {
            printf("%d ",i+j);
        }

        for(j=2*i-1;j>=2*i-i;j--)
        {
            printf("%d ",j);
        }

        printf("\n");
    }
}