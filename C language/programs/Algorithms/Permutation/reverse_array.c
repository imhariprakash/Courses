#include<stdio.h>
#include<stdlib.h>

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


int main()
{
    int array[]={1,2,3,4,5,6,7};
    reverse_array(array,2,6);
    printArray(array,7);
}