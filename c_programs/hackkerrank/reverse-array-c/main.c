#include<stdio.h>
#include<stdlib.h>
void swap(int *arr,int a,int b)
{
  int temp;
  temp=arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}
void reverse(int *arr,int k)
{
    int i;
    for(i=0;i<k/2;i++)
    {
        swap(arr,i,n-1-i);
    }
}
int main()
{
    int n,i;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        printf("Enter the element: ");
        scanf("%d",&arr[i]);
    }
    reverse(&arr,n);
    for(i=0;i<n;i++)
    printf("%d ",arr[i]);
 return 0;   
}

