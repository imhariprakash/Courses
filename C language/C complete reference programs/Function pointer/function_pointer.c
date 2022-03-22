#include <stdio.h>
#include <stdlib.h>

typedef int (*FP)(int, int);

int sum(int a, int b){
    return a + b;
}

int mod(int a, int b){
    return a % b;
}

int execute(int a, int b, FP fun){
    return(fun(a,b));
}


int main()
{
    printf("a + b = %d\n",execute(10, 5, sum));
    printf("a % b = %d\n",execute(10, 5, mod));
    return 0;
}