#include<stdio.h>
#include<stdlib.h>

int main()
{
    int row,col,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&row);
    printf("Enter the number of columns: ");
    scanf("%d",&col);

    for(i=0;i<row;i++)
    {
        for(j=i;j>=0;j--)
        {
            printf("%d ",j+1);
        }
        for(j=2;j<=row-i;j++)
        {
            printf("%d ",j);
        }
        printf("\n");
    }
}