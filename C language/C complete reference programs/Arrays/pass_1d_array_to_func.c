#include<stdio.h>
#include<stdlib.h>

void getArray(int *array,int n)//pointer
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element number %d : %d.\n",i+1,array[i]);
    }
}

void getArray1(int array[10],int n)//pointer
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element number %d : %d.\n",i+1,array[i]);
    }
}

void getArray2(int array[],int n)//pointer
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element number %d : %d.\n",i+1,array[i]);
    }
}

int main()
{
    int array[]={1,2,3,4,5,6},n=6;
    getArray(array,n);

    
}