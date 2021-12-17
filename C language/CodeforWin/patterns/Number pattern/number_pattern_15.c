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
        for(j=0;j<col-1-i;j++)
        {
            printf("%d ",i+j+1);
        }
        for(j=0;j<=i;j++)
        {
            printf("%d ",row);
        }
        printf("\n");
    }
}