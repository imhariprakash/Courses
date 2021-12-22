#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=1;j<=2*i+1;j=j+2)
        {
            printf("%d ",j);
        }

        for(j=2*i-1;j>=1;j=j-2)
        {
            printf("%d ",j);
        }

        printf("\n");
    }
}