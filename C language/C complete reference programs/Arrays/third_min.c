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
    int n,i,fmin,smin,tmin;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array,n);
    fmin=array[0],smin=array[1],tmin=array[2];

    for(i=1;i<n;i++)
    {
        if(array[i]<fmin)
        {
            tmin=smin;
            smin=fmin;
            fmin=array[i];
        }
        else if(array[i]<smin)
        {
            tmin=smin;
            smin=array[i];
        }
        else if(array[i]<tmin)
        {
            tmin=array[i];
        }
    }
    printf("\nThe first minimum is %d.",fmin);
    printf("\nThe second minimum is %d.",smin);
    printf("\nThe third minimum is %d.\n",tmin);
    //printArray(array,n);
}