#include<stdio.h>

void get_array(int *arr,int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d: ",i+1);
scanf("%d",arr+i);
}
}

void print_array(int *arr,int n)
{
int i;
for(i=0;i<n;i++)
printf("%d ",*(arr+i));
}
int main()
{
int n;
printf("Enter the number of elements: ");
scanf("%d",&n);
int arr[n];
get_array(arr,n);
print_array(arr,n);
return 0;
}
