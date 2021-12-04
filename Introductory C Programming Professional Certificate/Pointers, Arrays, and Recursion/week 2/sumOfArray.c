#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void getArray(int *arr,int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Enter the element %d : ",i);
        scanf("%d",arr+i);
    }
}

int printArray(int *arr,int n)
{
    int total=0,i;
    for(i=0;i<n;i++)
    {
        total+=arr[i];
    }
    return total;
}

int main()
{
    int n,total;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int arr[n];
    getArray(arr,n);
    total=printArray(arr,n);
    printf("The sum of the elemets is %d\n.",total);
    return 0;
}