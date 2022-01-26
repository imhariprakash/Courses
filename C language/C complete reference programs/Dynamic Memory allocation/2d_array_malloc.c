#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int i,j,n,(*p)[10];
    printf("Enter the power: ");
    scanf("%d",&n);
    p=(int(*)[10])malloc(n*10*sizeof(int));
    for(i=0;i<n;i++)
    {
        for(j=0;j<10;j++)
        {
            p[i][j]=pow(j+1,i+1);
        }
    }

    for(i=0;i<10;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%5d   ",p[j][i]);
        }
        printf("\n");
    }
    free(p);
}