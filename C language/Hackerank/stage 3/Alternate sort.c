#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int max(int *array, int index, int n)
{
    int max=-999999999,maxin=0,i;
    for(i=index;i<n;i++)
    {
        if(max < array[i])
        {
            max=array[i];
            maxin = i;
        }
    }
    return maxin;
}

int min(int *array, int index, int n)
{
    int min=999999999,minin=0,i;
    for(i=index;i<n;i++)
    {
        if(min > array[i])
        {
            min=array[i];
            minin = i;
        }
    }
    return minin;
}

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n,i,j,m,temp;
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            if(i %2 ==0)
            {
                m = min(array,j,n);
            }
            else
            {
                m = max(array,j,n);                
            }
            temp=array[m];
            array[m]=array[j];
            array[j]=temp;
        }
    }
    
    for(i=0;i<n;i++)
        printf("%d ",array[i]);
    return 0;
}
