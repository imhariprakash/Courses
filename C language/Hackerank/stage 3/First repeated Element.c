#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i,j,n,gap=10000000,relem = -99999999;
    scanf("%d",&n);
    int array[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(array[i]==array[j])
            {
                if(j-i < gap)
                {
                    gap = j-i;
                    relem = array[j];
                }
            }
        }
    }
    if(relem == -99999999)
    {
        printf("No Element Is Repeated");
        return 0;
    }
    printf("%d",relem);
    return 0;
}
