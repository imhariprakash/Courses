#include <stdio.h>

int main()
{
    int n,i,j,k;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    
    for(i=0;i<n-1;i++)
    {
        for(k=0;k<n-1-i;k++)
        {
            printf("  ");
        }
        for(j=0;j<(2*i)+1;j++)
        {
            if(j==0 || j==(2*i))
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
    
    for(i=0;i<n;i++)
    {
        for(k=0;k<i;k++)
        {
            printf("  ");
        }
        for(j=0;j<(2*(n-1-i))+1;j++)
        {
            if(j==0 || j==(2*(n-1-i)))
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
}
