#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,i,j;
    scanf("%d",&n);
    for(i=0;i<ceil((float)n/2);i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || (i+j==n-1))
                {
                    printf("*");
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
        for(i=0;i<(n-1)/2;i++)
        {        
            for(j=0;j<(n-1)/2-1-i;j++)
                printf(" ");
            printf("*");
            for(j=n%2;j<2*(i+1);j++)
                printf(" ");
            printf("*");
            printf("\n");
        }

    return 0;
}
