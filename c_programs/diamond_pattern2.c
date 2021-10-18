#include<stdio.h>

void equilateral_triangle(int n)
{
    int i,j,k;
    for(i=1;i<n;i++)
    {
        for(k=1;k<=(n-i);k++)
        printf(" ");
        for(j=1;j<=(2*i)-1;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}
void inv_equilateral(int n)
{
    int i,j,k;
    for(i=n-1;i>=0;i--)
    {
        for(k=i;k<n-1;k++)
            printf(" ");
        for(j=0;j<(2*i)+1;j++)
            printf("*");
        printf("\n");
    }
}


int main()
{
    int n;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    equilateral_triangle(n);
    inv_equilateral(n);
    return 0;
}
