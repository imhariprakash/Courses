#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,i,a[100],temp=0,range=0;
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    
    for(i=0;i<n;i++)
    {
        if(a[i]-a[i+1]!=1)
        {
            temp=i+1;
            break;
        }
    }
    
    range=n%temp;
    printf("%d\n",temp);
    if(range==0)
    {
        printf("No Remaining Elements");
        return 0;
    }
    for(i=0;i<range;i++)
    {
        printf("%d ",a[n-range+i]);
    }
    
    return 0;
    
}