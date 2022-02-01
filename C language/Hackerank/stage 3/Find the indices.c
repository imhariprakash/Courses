#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int i,n,temp;
    scanf("%d",&n);
    int array[n],subarray[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<n;i++)
    {
        temp = array[i];
        subarray[temp]=i;
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",subarray[i]);
    }
    return 0;
}