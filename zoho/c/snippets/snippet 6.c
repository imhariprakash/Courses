#include<stdio.h>

void foo(int n, int sum){
    int k = 0, j = 0;
    if(n == 0) return;
    k = n% 10;
    j = n / 10; 
    k = sum * k;
    sum = sum * k + 1;
    foo(j, sum);
    printf("%d ",k % 10);
}

int main(){
    int a = 7230, sum = 2;
    foo(a, sum);
    printf("%d ",sum);
    getchar();
}

// 1 8 3 0 2