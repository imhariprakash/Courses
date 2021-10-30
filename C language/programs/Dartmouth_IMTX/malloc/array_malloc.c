#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *arr,i;
    arr=malloc(5*sizeof(int));
    arr[0]=1;
    *(arr+1)=2;
    *(arr+2)=3;
    arr[3]=4;
    arr[4]=5;
    for(i=0;i<5;i++)
    {
        printf("%d ",arr[i]);
    }
    free(arr);
    for(i=0;i<5;i++)
    {
        printf("%d ",arr[i]);
    }
}