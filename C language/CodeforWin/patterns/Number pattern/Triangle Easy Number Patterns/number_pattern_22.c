#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=n;j>i;j--)
        {
            printf("%d ",i+1);
        }
        printf("\n");
    }
}