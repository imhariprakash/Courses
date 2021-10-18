#include<stdio.h>

void triangle_1(int n)
{
    int i,j,k,l;
    for(i=0;i<n+1;i++)
    {
        for(k=0;k<i;k++)
            printf(" ");
        for(j=0;j<n+1;j++)
        {
            if(i<=j)
            {
                printf("*");
            }
        }
        for(l=0;l<n+1;l++)
        {
            if(i+l<=n-1)
                printf("*");
        }
        printf("\n");
    }
}

int main()
{
    int n;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    triangle_1(n);
}
