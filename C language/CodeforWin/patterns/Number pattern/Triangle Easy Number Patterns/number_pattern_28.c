#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            printf("%d ",n-j+1);
        }
        printf("\n");
    }
}