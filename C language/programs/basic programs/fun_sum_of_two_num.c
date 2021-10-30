#include<stdio.h>
float two_sum(float x,float y)
{
    float result;
    result=x+y;
    return(result);
}
int main()
{
    float x,y,ans;
    printf("Enter the number 1: ");
    scanf("%f",&x);
    printf("Enter the number 2: ");
    scanf("%f",&y);
    ans=two_sum(x,y);
    printf("\nThe sum of the two numbers %.2f and %.2f is %.2f.\n",x,y,ans);
    return 0;
}
