#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n,i,j,max;
    scanf("%d", &n);
    for(i=n-1;i>=1-n;i--)
    {
        for(j=1-n;j<=n-1;j++)
        {
           max=abs(i)>abs(j) ? i:j;
           max=abs(max)-1;
           printf("%d ",max+2);
        }
        printf("\n");
    }
    return 0;
}

