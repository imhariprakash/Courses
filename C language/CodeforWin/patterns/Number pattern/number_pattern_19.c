#include<stdio.h>
#include<stdlib.h>

int main()
{
    int left=0,right,i,j,n,N=1,size;
    printf("Enter a number: ");
    scanf("%d",&n);
    int arr[n][n];
    size=n/2;
    right=n-1;

    for(i=0;i<=size;i++,left++,right--)
    {
        for(j=left;j<=right;j++,N++)
        {
            arr[left][j]=N;
        }

        for(j=left+1;j<=right;j++,N++)
        {
            arr[j][right]=N;
        }

        for(j=right-1;j>=left;j--,N++)
        {
            arr[right][j]=N;
        }

        for(j=right-1;j>=left+1;j--,N++)
        {
            arr[j][left]=N;
        }
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%-3d ",arr[i][j]);
        }
        printf("\n");
    }
}