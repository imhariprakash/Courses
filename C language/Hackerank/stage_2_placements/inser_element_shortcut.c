#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int arr[100],n,temp,i,turn=1;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&temp);
    for(i=0;i<n;i++)
    {
        if(turn==1 &&temp < arr[i])
        {
            printf("%d ",temp);
            turn=0;
        }
        printf("%d ",arr[i]);
    }
    if(turn==1)
        printf("%d",temp);
    return 0;
}
