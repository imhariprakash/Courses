#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char num[]={'0','1','2','3','4','5','6','7','8','9'};
    int i,j,count[10]={0,0,0,0,0,0,0,0,0,0};
    char str[1000];
    scanf("%s",str);
    for(i=0;i<strlen(str);i++)
    {
        for(j=0;j<10;j++)
        {
            if(str[i]==num[j])
            {
                count[j]++;;
                break;
            }
        }
    } 
    
    for(i=0;i<10;i++)
    {
        printf("%d ",count[i]);
    } 
    return 0;
}
