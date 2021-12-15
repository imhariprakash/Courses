#include <stdio.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    
    for(i=0;i<2*n-1;i++)
    {
        for(j=0;j<n;j++)
        {
            if(((i==0)&&(j!=0 && j!=n-1)) || ((i==2*(n-1))&&(j!=0 && j!=n-1)) || (i==(n-1) && (j!=0 && j!=n-1)))
            {
                printf(" *");
            }
            
            else if((j==0 && (i!=0 && i!=n-1 && i!=2*(n-1))) || (j==(n-1) && (i!=0 && i!=n-1 && i!=2*(n-1))))
            {
                printf(" *");
            }
            
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
}