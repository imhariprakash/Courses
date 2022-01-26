#include<stdio.h>
#include<stdlib.h>

void printArray(int *array,int n)
{
    int i;
    for(i=0;i<n-1;i++)  //n-1 to print upto index specified as count++ makes 1 extra size count
    {
        printf("Element %d : %d.\n",i+1,*((int*)array+i));
    }
}

void addElement(int *array,int index, int element,int count)
{
    int i,temp;
    for(i=index;i<count;i++)
    {
        temp=array[i];
        array[i]=element;
        element=temp;
    }
    array[i]=element;
}


int main()
{
    int element,index,count=0;
    int *array;
    array=(int*)calloc(100,sizeof(int));   //used calloc since it initializes the array with zero - don't forget to type cast 
    printf("Press -1 is want to exit!\n"); //don't forget to free the memory
    printf("Enter the index: ");
    scanf("%d",&index);
    while(index >=0)
    {
        if(count<=index+1)
            count=index+1;
        printf("Enter the element: ");
        scanf("%d",&element);
        addElement(array,index,element,count);
        count++;
        printf("Enter the index: ");
        scanf("%d",&index);
    }

    printArray(array,count);
    free(array);
    
}