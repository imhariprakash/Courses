#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char array[20];
    int i,j,count;
    scanf("%s",array);
    count = strlen(array);
    if(count % 2 ==1)
    {
        for(i=0;i<count;i++)
        {
            for(j=0;j<count;j++)
            {
                if(i==j)
                {
                    printf("%c",array[i]);
                }
                else if(i+j == count-1)
                {
                    printf("%c",array[count-1-i]);
                }
                else
                {
                    printf(" ");
                }
            }
            printf("\n");
        }
    }
    
    else
    {
        for(i=0;i<count/2;i++)
        {
            for(j=0;j<count;j++)
            {
                if(i==j)
                {
                    printf("%c",array[i]);
                }
                else if(i+j == count-1)
                {
                    printf("%c",array[count-1-i]);
                }
                else{
                    printf(" ");
                }
            }
            printf("\n");
        }
        for(;i < count-1;i++)
        {
            for(j=0;j<count;j++)
            {
                if(i+1==j)
                {
                    printf("%c",array[i+1]);
                }
                else if(i+j == count-2)
                {
                    printf("%c",array[count-2-i]);
                }
                else
                {
                    printf(" ");
                }
            }
            printf("\n");
        }
    }
    
    return 0;
}