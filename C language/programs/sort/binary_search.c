#include<stdio.h>
#include <stdlib.h>
int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}
int main()
{
    int n,num,i;
    printf("Enter the number of Elements: ");
    scanf("%d",&n);
    int arr[n],start=0,end=n-1,middle;
    for(i=0;i<n;i++)
    {
        printf("Enter the element number %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    qsort(arr,n,sizeof(int),cmpfunc);
    printf("\nEnter the element to search: ");
    scanf("%d",&num);
    while((start!=end)){
        middle=((start+end)/2);
        if(num>arr[middle])
            start=middle+1;
        else
            end=middle;
    }
    if(arr[start]==num)
        printf("Element \"%d\" is found at the index %d.\n",num,start);
    else
        printf("Element not found.\n");

 return 0;
}
