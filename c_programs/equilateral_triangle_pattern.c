#include<stdio.h>

void equilateral_triangle(int n)
{
    int i,j,k,l;
    for(i=0;i<n;i++)
    {
        for(k=0;k<(n-1-i);k++)
            printf(" ");
        for(j=0;j<n;j++)
        {
            if(i+j>=n-1)
            {
                printf("*");
            }
        }
        for(l=0;l<n;l++)
        {
            if(i>=l)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}

int main()
{
    int n;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    equilateral_triangle(n);
    return 0;
}
