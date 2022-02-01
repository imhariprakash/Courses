#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int findk(int array[],int n)
{
    int i;
    for(i=0;i<n-1;i++)
    {
        if(array[i] < array[i+1])
            return(i+1);
    }
    return n;
}

int main() {

    int n,k,rem,i;
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    k=findk(array,n);
    printf("%d\n",k);
    rem = n % k;
    if(rem==0)
    {
        printf("No Remaining Elements");
    }
    for(i=0;i<rem;i++)
    {
        printf("%d ",array[n-rem+i]);
    }
    
    return 0;
}