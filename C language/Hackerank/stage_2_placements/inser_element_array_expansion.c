#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


void printArray(int array[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d ",array[i]);
    }
}

void getArray(int array[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
}

int findIndex(int array[],int n,int ele)
{
    //sorted array - so just return where it belongs
    int i;
    for(i=0;i<n;i++)
    {
        if(ele < array[i])
        {
            break;
        }
    }   
    return i;
}

void insertElement(int array[],int *n,int index,int elem)
{
    int i,temp;
    for(i=index;i<*n;i++)
    {
        temp=array[i];
        array[i]=elem;
        elem=temp;
    }
    array[i]=elem;
    *n=*n+1;
}




int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int arr[100],n,temp,index;
    scanf("%d",&n);
    
    getArray(arr,n);
    
    scanf("%d",&temp);
    
    index=findIndex(arr,n,temp);
    insertElement(arr,&n,index,temp);
    
    printArray(arr,n);
    
    
    return 0;
}
