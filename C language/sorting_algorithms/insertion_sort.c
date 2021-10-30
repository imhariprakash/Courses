/*

if the element is less than key just pass.
if the previous element is greater than key then continue comparing with previous elements
until they are greater than key - no need to search till the beginning since the list is already sorted.

given - 6 5 4 3 2 1

step:1 - 5 6 4 3 2 1
step:2 - 4 5 6 3 2 1
step:3 - 3 4 5 6 2 1
step:4 - 2 3 4 5 6 1
step:5 - 1 2 3 4 5 6

append at the correct place then right shift all elements by one step until key

*/

#include<stdio.h>

//get array
void get_array(int *arr,int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d: ",i+1);
scanf("%d",arr+i);
}
}

//print array
void print_array(int *arr,int n)
{
int i;
for(i=0;i<n;i++)
printf("%d ",*(arr+i));
}

//insertion sort
void insertion_sort(int *arr,int n)
{
    int i,j,key;
    for(j=1;j<n;j++)
    {
        key=arr[j];
        i=j-1;
        while (i>=0 && arr[i]>key) //if key is greater just pass else right shift all elements until key is smaller.
        {
            arr[i+1]=arr[i];
            i=i-1;
        }
        arr[i+1]=key;
    }
}

int main()
{
int n;
printf("Enter the number of elements: "); //get no of elements
scanf("%d",&n);
int arr[n];
get_array(arr,n);
printf("The given array is : "); //get array
print_array(arr,n);
insertion_sort(arr,n);
printf("\nThe sorted array is : "); // print sorted array
print_array(arr,n);
return 0;
}
