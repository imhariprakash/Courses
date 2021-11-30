#include<stdio.h>

typedef struct rect_t
{
    int left;
    int right;
    int top;
    int bottom;
}rect_t;
//typedef struct rect_t rect_t;
int main()
{
    //struct rect_t myRect={1,2,3,4};
    rect_t myRect={1,2,3,4};
    printf("(%d,%d)\n",myRect.left,myRect.right);
}