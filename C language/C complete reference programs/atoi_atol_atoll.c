#include<stdio.h>
#include<stdlib.h>

int main()
{
    printf("%lf\n",atof("100.123abcd"));
    printf("%d\n",atoi("10a0.1234aaa"));  //10(number must start in beginning) - see characters - break - return
    printf("%ld\n",atol("100a.1234"));    //100 - long int

}