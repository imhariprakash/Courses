#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int average(int array[],int n)
{
    int i,sum=0;
    for(i=0;i<n;i++)
    {
        sum+=array[i];
    }
    return(sum/n);
}

int difference(int a,int b)
{
    return(abs(a-b));
}

int main() {
    int n,i,avg,avgel=10000000,avgdiff=10000000,temp;
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    avg = average(array,n);
    for(i=0;i<n;i++)
    {
        temp=difference(avg,array[i]);
        if(avgdiff == temp && array[i] < avgel)
        {
            avgel = array[i];
        }
        if(avgdiff > temp)
        {
            avgdiff = temp;
            avgel = array[i];
        }
    }
    printf("%d",avgel);
    return 0;
}