#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int gcd(int a, int b) 
{
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
}

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n,temp,max=0,k,i;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&k);
    
    for(i=0;i<n-1;i++)
    {
        temp=gcd(k,arr[i]);
        if(temp > max)
            max=temp;
    }
    printf("%d",max);
    
    
    return 0;
}
