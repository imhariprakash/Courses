#include<stdio.h>
#include<stdlib.h>

static int num;

void sample(int i)
{
    num+=i;
    printf("%d  ",num);
}

int main()
{
    num=0;
    for(int i=0;i<10;i++)
    {
        sample(i);
    }
    printf("\n%d\n",num);
}