#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int min_arr(int arr[],int start,int stop)
{
    int i,min=100000;
    for(i=start;i<stop;i++)
    {
        if(min>arr[i])
            min=arr[i];
    }
    return min;
}

int max_arr(int arr[],int start,int stop)
{
    int i,max=-100000;
    for(i=start;i<stop;i++)
    {
        if(max<arr[i])
            max=arr[i];
    }
    return max;
}

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,i,turn=0,k,start,stop;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&k);
    
    for(i=0;i<n;i=i+k)
    {
        start=i;
        if(i+k > n-1 )
            stop=n;
        else
            stop=i+k;
        if(turn==0)
        {
            printf("%d ",max_arr(arr,start,stop));
            turn=1;
        }
        else
        {
            printf("%d ",min_arr(arr,start,stop));
            turn=0;
        }
    }
        
    
    return 0;
}
