#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,sum=0,temp;
    scanf("%d",&n);
    while(n)
    {
        temp=n%10;
        if(temp==1 || temp==2 || temp==3 || temp==5 || temp==7) 
            sum++;
        n=n/10;
    }
    printf("%d",sum);
    return 0;
}