#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct
{
    int d:6;
    int m:5;
    int y;
}date;

int main()
{
    date dt={31,12,2014};
    printf("%d %d %d %d\n",dt.d,dt.m,dt.y,(int)sizeof(dt));  //31/12/2014 - 8 bytes
    //printf("%d %d %d\n",(int)sizeof(dt.d),(int)sizeof(dt.m),(int)sizeof(dt.y));  //sizeof - can't applied to a bitfield
}