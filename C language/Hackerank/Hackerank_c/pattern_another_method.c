#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n,i,j,min;
    scanf("%d", &n);
    for(i=n-1;i>=1-n;i--)
    {
        for(j=1-n;j<=n-1;j++)
        {
           min=abs(i)>abs(j) ? i:j;
           min=abs(min)-1;
           printf("%d ",min+2);
        }
        printf("\n");
    }
    return 0;
}
