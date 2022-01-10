#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char str[100];
    int n,i;
    fgets(str,100,stdin);
    n=strlen(str);
    for(i=n-1;i>=0;i--)
    {
        printf("%c",str[i]);
    }
    return 0;
}
