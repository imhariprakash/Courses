#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        printf("Enter the element %d : ",i+1);
        scanf("%d",&array[i]);
    }

    for(i=0;i<n;i++)
    {
        printf("Element %d is %d.\n",i+1,array[i]);
    }

    //size of array

    printf("\nThe size of the array is %d * %d = %d.\n",n,(int)sizeof(array[0]),(int)sizeof(array));
}