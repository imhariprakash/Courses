#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++)
        {
            if(j%2==0)
            {
                printf("1 ");
            }
            else
            {
                printf("0 ");
            }
        }
        printf("\n");
    }
}