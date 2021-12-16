#include<stdio.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    printf("\n\n");
    for(i=n/2;i<n;i=i+2)
    {
        for(j=i+2;j<n;j=j+2)           //spaces
        {
            printf("  ");
        }

        for(j=0;j<i;j++)                //stars
        {
            printf("* ");
        }

        for(j=0;j<n-i;j++)          //space
        {
            printf("  ");
        }

        for(j=0;j<i;j++)               //stars
        {
            printf("* ");
        }
        printf("\n");
    }


    // inverted equilateral triangle
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf("  ");
        }

        for(j=0;j<(2*(n-i)-1);j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    printf("\n\n");
}