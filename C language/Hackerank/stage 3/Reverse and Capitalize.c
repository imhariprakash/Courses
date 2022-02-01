#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void lower(char *array, int len)
{
    int i;
    for(i=0;i<len;i++)
    {
        if(*(array+i)>=65 && *(array+i)<=90)
        {
            *((char*)array+i) = *((char*)array+i)+32;
        }
    }
}

void upper(char *array, int len)
{
    int i;
    for(i=0;i<len;i++)
    {
        if(*(array+i)>=97 && *(array+i)<=122)
        {
            *((char*)array+i) = *((char*)array+i)-32;
        }
    }
}

void reverse(char *array, int len)
{
    int i;
    for(i=0;i<len/2;i++)
    {
        char temp;
        temp = *(array+i);
        *(array+i) = *(array+len-1-i);
        *(array+len-1-i) = temp;
    }
}

int main() {
    int i,count=0,timer=1;
    char array[100],*start;
    scanf("%[a-z!?,. A-Z]s",array);
    start = (char*)&array[0];
    for(i=0;(array[i] != '\0');i++)
    {
        if(array[i]==' ' || array[i+1]=='\0')
        {
            if(timer==1)
            {
                if(*(start+count-1)==',')
                {
                    count--;
                }
                lower(start,count);
                reverse(start,count);
                timer=2;
            }
            else if(timer==2)
            {
                upper(start,count);
                timer=1;
            }
            start = (char*)&array[i+1];
            count=0;
        }
        else{
            count++;
        }
    }
    printf("%s",array);
    return 0;
}
