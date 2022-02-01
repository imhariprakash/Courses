#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {    
    int i,j,count;
    char array[20];
    scanf("%s",array);
    count = strlen(array);
    for(i=0;i<ceil(count/2.0);i++)
    {
        for(j=0;j<count-1-i;j++)
        {
            printf(" ");
        }
        for(j=0;j<=i;j++)
        {
            printf("%c",array[j+count/2]);
        }
        printf("\n");
    }
    for(i=0;i<count/2;i++)
    {
        for(j=1;j<count/2 -i;j++)
        {
            printf(" ");
        }
        printf("%s",(array+count/2));
        for(j=0;j<=i;j++)
        {
            printf("%c",array[j]);
        }
        printf("\n");
    }
    return 0;
}
