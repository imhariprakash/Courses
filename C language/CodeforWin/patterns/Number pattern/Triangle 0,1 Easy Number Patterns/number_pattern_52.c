#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
            for(j=0;j<=i;j++)
            {
                if(i<=n/2)
                    printf("%d ",i+1);
                else
                    printf("%d ",n-i);
            }
        printf("\n");
    }
}