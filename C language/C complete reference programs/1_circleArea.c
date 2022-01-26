#include<stdio.h>
#include<stdlib.h>

double circleArea(double radius)
{
    return 3.141592654*radius*radius;
}

int main()
{
    double rad;
    printf("Enter the radius: ");
    scanf("%lf",&rad);
    double area=circleArea(rad);
    printf("Area: %.2lf\n",area);
}