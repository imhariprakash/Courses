#include <stdio.h>

int main()
{
    int n,i,j,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    {
        for(k=0;k<n-i;k++)
        {
            printf("* ");
        }
        
        for(j=0;j<(2*i);j++)
        {
            if(i==0)
                printf("* ");
            else
                printf("  ");
        }
        
        for(k=0;k<n-i;k++)
        {
            printf("* ");
        }
        
        printf("\n");
    }
    
    for(i=0;i<n;i++)
    {
        for(k=0;k<i+1;k++)
        {
            printf("* ");
        }
        
        for(j=0;j<(2*(n-1-i));j++)
        {
            printf("  ");
        }
        
        for(k=0;k<i+1;k++)
        {
            printf("* ");
        }
        
        printf("\n");
    }
}