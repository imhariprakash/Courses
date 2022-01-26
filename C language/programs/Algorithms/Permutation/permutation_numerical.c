#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void getArray(int array[], int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Enter element %d: ",i+1);
        scanf("%d",array+i);
    }
}

void printArray(int array[], int n)
{
    int i;
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("%d  ",*(array+i));
    }
    printf("\n");
}

int getk(int array[],int n)
{
    int k=-1;
    for(int i=0;i<n-1;i++)
    {
        if(array[i] < array[i+1])
        {
            k=i;
        }
    }
    return k;
}

int getl(int array[],int n,int k)
{
    int i,l;
    for(i=0;i<n;i++)
    {
        if(array[k] < array[i])
        {
            l=i;
        }
    }
    return l;
}

void swap(int* a, int* b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

void reverse_array(int array[], int start, int end)
{
    int middle;
    middle=((end + start)/2);
    for(int i=start;i<=middle;i++)
    {
        swap(&array[i],&array[end]);
        end--;
    }
}

int next_permutation(int array[],int n)
{
    int k,l;
    k = getk(array,n);                        //getk   ->  first get k (largest) such that a[k] < a[k+1]   -> dont exist means - no more perm
    if(k == -1)
    {
        return 0;
    }
    l = getl(array,n,k);                      //get l  -> such that l (largest) - index(l and k)  -> a[k] < a[l]  //first condition satisfied means there is k+1 geater than k
    swap(&array[k],&array[l]);                //swap a[k] and a[l]
    reverse_array(array,k+1,n-1);             // reverse the array from k+1 to n-1
}

int main()
{
    // int n;
    // printf("Enter number of elements: ");
    // scanf("%d",&n);
    // int array[n];
    // getArray(array,n);
    // printArray(array,n);

    int array[]={1,1,2},next,n=3,count=0;
    printArray(array,n);
    do
    {
        next = next_permutation(array,n);
        count++;
        if(next == 0)
        {
            break;
        }
        printArray(array,n);
    }while(1);
    printf("\n%d\n",count);
}
