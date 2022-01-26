#include<stdio.h>
#include<stdlib.h>

int main()
{
    char ch='A';
    int i=1;
    float f=2.0;
    double d=3;
    double result=(ch/i)+(f*d)-(f+i);
    printf("%lf\n",result);
    int resul=(int)((ch/i)+(f*d)-(f+i));
    printf("%d",resul);
}
    