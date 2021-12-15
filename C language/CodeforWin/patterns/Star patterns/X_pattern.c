#include <stdio.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    n=2*n;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1;j++)
        {
            if(i==j || i+j==n-2)
                printf("+ ");
            else
                printf("  ");
        }
        printf("\n");
    }
}