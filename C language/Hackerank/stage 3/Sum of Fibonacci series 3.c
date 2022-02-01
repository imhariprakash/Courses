#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int i,n,sum=0;
    scanf("%d",&n);
    int array[n];
    array[0]=0;array[1]=1;
    for(i=2;i<n;i++)
    {
        array[i]=array[i-1]+array[i-2];
    }
    
    for(i=0;i<n;i++)
    {
        sum+=array[i];
    }
    printf("%d",sum);
    
    return 0;
}
