#include<stdio.h>

void triangle_1(int n)
{
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i>=j)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}

void triangle_2(int n)
{
    int i,j,k;
    for(i=0;i<n;i++)
    {
        for(k=0;k<i;k++)
            printf(" ");
        for(j=0;j<n;j++)
        {
            if(i<=j)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}

void triangle_2_method_2(int n)
{
    int i,j,k;
    for(i=0;i<n;i++)
    {
        for(k=0;k<i;k++)
            printf(" ");
        for(j=0;j<n;j++)
        {
            if(i+j<=n-1)
            {
                printf("*");
            }
        }
        printf("\n");
    }
}

void triangle_3(int n)
{
    int i,j,k;
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
        printf("\n");
    }
}

void triangle_4(int n)
{
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i+j<=n-1)
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
    printf("\n");
    triangle_4(n);
    printf("\n");
    triangle_3(n);
    printf("\n");
    triangle_2(n);
    return 0;
}
