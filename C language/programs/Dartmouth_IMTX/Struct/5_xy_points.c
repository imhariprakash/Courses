#include<stdio.h>

struct point
{
    int x,y;
};

void get_details(struct point *poin)
{
    printf("Enter x: ");
    scanf("%d",&poin->x);
    printf("Enter y: ");
    scanf("%d",&poin->y);
}

void print_details(struct point poin)
{
    printf("(%d,%d)\n",poin.x,poin.y);
}

int main()
{
    int i;
    struct point poin[5];
    for(i=0;i<5;i++)
    {
        get_details(&poin[i]);
    }
    for(i=0;i<5;i++)
    {
        print_details(poin[i]);
    }
}
