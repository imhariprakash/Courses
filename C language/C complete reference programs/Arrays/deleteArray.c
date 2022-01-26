#include<stdio.h>
#include<stdlib.h>

void deleteIndex(int array[],int index, int *count)
{
    int i;
    if(index > *count-1)
    {
        printf("Index entered is out of range!\n");
        *count=*count+1;
    }
    else if(*count > 0)
    {
        for(i=index;i<*count-1;i++)
        {
            array[i]=array[i+1];
        }
    }
    else
    {
        printf("Can't delete from an empty array!\n\n");
    }
}

void printArray(int array[],int n,int choice)
{
    int i;
    if(choice==1)
    {
        for(i=0;i<n;i++)
        {
            printf("%d ",array[i]);
        }
    }
    else
    {
        for(i=0;i<n;i++)
        {
            printf("Element %d : %d.\n",i+1,*((int*)array+i));
        }
    }
}

int main()
{
    int array[]={1,2,3,4,5,6,7,8,9,10},index,count=10;
    printArray(array,count,1);
    printf("\nEnter the index to delete: ");
    scanf("%d",&index);
    while(index > -1 && count > 0)
    {
        deleteIndex(array,index,&count);
        count--;
        printArray(array,count,1);
        printf("\nEnter the index to delete: ");
        scanf("%d",&index);
    }
    if(count < 1)
    {
        printf("Array is empty\n");
        return 0;
    }
    printArray(array,count,2);
}