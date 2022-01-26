#include<stdio.h>
#include<stdlib.h>

void printArray(int* array,int row, int col)
{
    int i,j;
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("Row %d Col %d element: %d\n",i+1,j+1,*array);
            array=(int*)array+1;
        }
    }
}

int main()
{
    int array[][3]={{1,1,1},{2,2,2},{3,3,3}},row=3,col=3;
    int *arrptr=(int*)&array[0][0];
    printArray(arrptr,row,col);
}