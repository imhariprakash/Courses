#include<stdio.h>
#include<stdlib.h>
struct polygon
{
    int x,y;
};

void getPoints(struct polygon *poly)
{
    printf("\nEnter the coordinates: \nEnter x: ");
    scanf("%d",&poly->x);
    printf("Enter y: ");
    scanf("%d",&poly->y);
}

void printPoints(struct polygon poly)
{
    printf("\n(%d,%d)",poly.x,poly.y);
}

int main()
{
    int n,i;
    struct polygon *poly;
    printf("Enter the number of points: ");
    scanf("%d",&n);
    poly=(struct polygon*)malloc(n*sizeof(poly)); //(n*sizeof(struct polygon));
    //struct polygon poly[n];
    for(i=0;i<n;i++)
    getPoints(&poly[i]);
    for(i=0;i<n;i++)
    printPoints(poly[i]);
    free(poly);
}
