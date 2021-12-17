#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number : ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf("%d ",n-j);
        }

        for(j=0;j<2*(n-i)-1;j++)
        {
            printf("%d ",n-i);
        }

        for(j=n-i;j<n;j++)
        {
            printf("%d ",j+1);
        }
        printf("\n");
    }

    for(i=0;i<n-1;i++)
    {
        for(j=n;j>=3+i;j--)
        {
            printf("%d ",j);
        }

        for(j=0;j<2*(i+1)+1;j++)
        {
            printf("%d ",i+2);
        }

        for(j=3+i;j<=n;j++)
        {
            printf("%d ",j);
        }
        
        printf("\n");
    }
}