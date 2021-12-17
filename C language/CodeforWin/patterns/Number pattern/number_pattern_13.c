#include<stdio.h>
#include<stdlib.h>

int main()
{
    int row,col,i,j,k=1;
    printf("Enter the number of rows: ");
    scanf("%d",&row);
    printf("Enter the number of columns: ");
    scanf("%d",&col);

    for(i=0;i<row;i++)
    {
        for(j=1;j<=col;j++,k++)
        {
            printf("%-3d",k);  // - will give left alignment while + will give right alignment
        }
        printf("\n");
    }
}