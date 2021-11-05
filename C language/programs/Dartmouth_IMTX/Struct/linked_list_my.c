#include<stdio.h>
#include<stdlib.h>

struct point
{
    int x,y;
    struct point *add;
};

int main()
{
    struct point pt1={0,0,NULL};
    struct point pt2={-1,1,NULL};
    struct point pt3={-2,4,NULL};
    struct point *start=&pt1,*ptr;
    pt1.add=&pt2;
    pt2.add=&pt3;
    ptr=start;
    while(ptr!=NULL)
    {
        printf("(%d,%d)\n",ptr->x,ptr->y);
        ptr=ptr->add;
    }
}
