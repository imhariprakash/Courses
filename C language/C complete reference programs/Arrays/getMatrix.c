#include<stdio.h>
int main()
{
    int row,col,i,j;
    printf("Enter the number of rows: ");
    scanf("%d",&row);
    printf("Enter the number of columns: ");
    scanf("%d",&col);
    int arr[row][col];
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("Enter the %d row %d column element: ",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
    }

    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("The %d row %d column element is %d.\n",i+1,j+1,arr[i][j]);
        }
    }
}