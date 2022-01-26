#include<stdio.h>
#include<stdlib.h>

void getArray(int array[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Enter the element %d : ",i+1);
        scanf("%d",array+i);
    }
}

void printArray(int array[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Element %d : %d.\n",i+1,*((int*)array+i));
    }
}

int main()
{
    int n,i;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array,n);
    printArray(array,n);
}