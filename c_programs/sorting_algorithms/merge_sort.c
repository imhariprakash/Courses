/*
Divide and conquer algorithm using subarrays so it is not a inplace type of algorithm
It uses 2 subarrays for linear merging purpose.
Inside this there are two functions

merge_Sort -> calls recursively until the array size is 1 -> then calls merge function each time when recursions call ends
merge function -> Initially at the depth of merge_sort recursive call -> when the index range is 1(single element) - First
call of merge happens -> compares two elements (neighbour) then two neighbour arrays and goes on

worst case,best case,average case -> all equal to n(log(n))
even though the array is already sorted the procedure is same - no exception
Rule  is Rule
slower for small arrays than other arrays.
*/

#include<stdio.h>
void get_array(int arr[],int n);
void print_array(int arr[],int n);
void merge_sort(int arr[],int beg,int end);
void merge(int arr[],int beg,int mid,int end);


int main()
{
int n;
printf("Enter the number of elements: ");
scanf("%d",&n);
int arr[n];
get_array(arr,n);
printf("The given array is : ");
print_array(arr,n);
merge_sort(arr,0,n-1);
printf("\nThe merged array is : ");
print_array(arr,n);
return 0;
}

void merge_sort(int arr[],int beg,int end) //Divide the array in to two halves continuously - until the depth is 1
{
   if(end > beg)
   {
       int mid=(beg+end)/2;
       merge_sort(arr,beg,mid);
       merge_sort(arr,mid+1,end);
       merge(arr,beg,mid,end);
   }
}

void merge(int arr[],int beg,int mid,int end)  // merge two subarrays in to the main array in the respective index range.
{

    int len_arr1=mid-beg+1,len_arr2=end-mid,i,j;
    int arr1[len_arr1],arr2[len_arr2];
    for(i=0;i<len_arr1;i++)
        arr1[i]=arr[beg+i];
    for(i=0;i<len_arr2;i++)
        arr2[i]=arr[mid+1+i];
    i=0;j=0;
    while(len_arr1 > 0 && len_arr2 > 0)
    {
        if(arr1[i] > arr2[j])
        {
            arr[beg+i+j]=arr2[j];
            j++;
            len_arr2 --;
        }
        else
        {
            arr[beg+i+j]=arr1[i];
            i++;
            len_arr1 --;
        }
    }
    while(len_arr1 > 0)
    {
        arr[beg+i+j]=arr1[i];
        i++;
        len_arr1 --;
    }
    while(len_arr2 > 0)
    {
        arr[beg+i+j]=arr2[j];
        j++;
        len_arr2 --;
    }
}

void get_array(int arr[],int n)
{
int i;
for(i=0;i<n;i++)
{
printf("Enter the element %d: ",i+1);
scanf("%d",arr+i);
}
}

void print_array(int arr[],int n)
{
int i;
for(i=0;i<n;i++)
printf("%d ",*(arr+i));
}

