#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int class_number=3;
int student_number=3;

void getArray(int array[][class_number],int class_num,int student_num)
{
    int i,j;
    for(i=0;i<class_num;i++)
    {
        printf("\nClass number %d.\n",i+1);
        for(j=0;j<student_num;j++)
        {
            printf("Total of student %d: ",j+1);
            scanf("%d",&array[i][j]);
        }
    }
}

void printArray(int array[][class_number],int class_number,int student_number)
{
    int i,j;
    for(i=0;i<class_number;i++)
    {
        printf("\nClass number %d.\n",i+1);
        for(j=0;j<student_number;j++)
        {
            printf("Total of student %d: %d.\n",j+1,array[i][j]);
        }
    }
}

int main()
{
    int array[class_number][student_number];
    getArray(array,class_number,student_number);
    printArray(array,class_number,student_number);
}