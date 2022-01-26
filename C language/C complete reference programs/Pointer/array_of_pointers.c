#include<stdio.h>
#include<stdlib.h>

void printString(char* array[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%s\n",array[i]);
    }
}



int main()
{
    char *array[]={"apple","ball","cat","dog"};
    //char *ptrString=array;
    char *ptrString=array[0];
    //printf("%p %p\n",ptrString,array[0]);
    printString(array,4);

}