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
    int n,i,fmin,smin;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array,n);
    fmin=array[0],smin=array[1];

    for(i=1;i<n;i++)
    {
        if(array[i]<fmin)
        {
            smin=fmin;
            fmin=array[i];
        }
        else if(array[i]<smin)
        {
            smin=array[i];
        }
    }
    printf("\nThe first minimum is %d.",fmin);
    printf("\nThe second minimum is %d.",smin);
    //printArray(array,n);
}