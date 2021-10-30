/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int **a,row,col,i,j;
    printf("Enter the no. of rows: ");
    scanf("%d",&row);
    printf("Enter the no. of columns: ");
    scanf("%d",&col);
    a=(int**)malloc(row*sizeof(int*));
    for(i=0;i<row;i++)
    {
        a[i]=(int*)malloc(col*sizeof(int));
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}