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

void printArray(char* array[], int n)
{
    int i;
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("%s  ",*((char**)array+i));
    }
    printf("\n");
}

int getk(char* array[],int n)
{
    int k=-1;
    for(int i=0;i<n-1;i++)
    {
        if(strcmp(array[i+1],array[i]) > 0)      //array[k] < array[k+1]  -> using strcmp  //char** -> deref to go to pointer pointing to char*
        {
            k=i;
        }
    }
    return k;
}

int getl(char* array[],int n,int k)
{
    int i,l;
    for(i=0;i<n;i++)
    {
        if(strcmp(array[i],array[k]) > 0)         //arr[k] < arr[k+1]  means there is always something greater than k exists!
        {
            l=i;
        }
    }
    return l;
}

void swap(char** a, char** b)
{
    char* temp;
    temp=*a;     //address of a is copied to temp -> b to a -> temp to b
    *a=*b;
    *b=temp;
}

void reverse_array(char* array[], int start, int end)
{
    int middle;
    middle=((end + start)/2);
    for(int i=start;i<=middle;i++)
    {
        swap(&array[i],&array[end]);
        end--;
    }
}

int next_permutation(char* array[],int n)
{
    int k,l;
    k = getk(array,n);                         //getk   ->  first get k (largest) such that a[k] < a[k+1]   -> dont exist means - no more perm
    if(k == -1)
    {
        return 0;
    }
    l = getl(array,n,k);                      //get l  -> such that l (largest) - index(l and k)  -> a[k] < a[l]
    swap(&array[k],&array[l]);   //char**              //swap a[k] and a[l]     //give pointer's address(pointer: pass by value - no effect) as input exchange values of pointer(address)
    reverse_array(array,k+1,n-1);             // reverse the array from k+1 to n-1

    return 1;   //next permutation exists
}

int main()
{
    // int n;
    // printf("Enter number of elements: ");
    // scanf("%d",&n);
    // int array[n];
    // getArray(array,n);
    // printArray(array,n);

    char *array[]={"a","bc","bc"};
    int next,n=3,count=0;
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
    }while(next);
    printf("\n%d\n",count);
}


//  ref:  https://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order