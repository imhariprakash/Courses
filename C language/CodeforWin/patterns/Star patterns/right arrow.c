#include <stdio.h>

int main()
{
    int n,i,j,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(k=0;k<2*i;k++)
        {
            printf("  ");
        }
        
        for(j=0;j<n-i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    
    for(i=1;i<n;i++)
    {
        for(k=0;k<2*(n-1-i);k++)
        {
            printf("  ");
        }
        
        for(j=0;j<i+1;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}