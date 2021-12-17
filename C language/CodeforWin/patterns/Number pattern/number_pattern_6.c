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
        for(j=0;j<col;j++)
        {
            if((i+j)%2==0)
            {
                printf("%d ",1);
            }
            else
            {
                printf("%d ",0);
            }
        }
        printf("\n");
    }
}