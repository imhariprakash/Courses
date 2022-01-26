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
    int n,i,fmax,smax;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array,n);
    fmax=array[0],smax=array[1];

    for(i=1;i<n;i++)
    {
        if(array[i]>fmax)
        {
            smax=fmax;
            fmax=array[i];
        }
        else if(array[i]>smax)
        {
            smax=array[i];
        }
    }
    printf("\nThe first maximum is %d.",fmax);
    printf("\nThe second maximum is %d.",smax);
    //printArray(array,n);
}