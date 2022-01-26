#include<stdio.h>
#include<string.h>
#include<stdlib.h>

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


int main()
{
    char *array[]={"ab","bc","cd","de"};
    reverse_array(array,0,3);
    printArray(array,4);

}