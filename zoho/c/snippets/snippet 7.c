#include<stdio.h>
#define p(x) printf("%d,",x);
#define q(x) printf("%d,",-x);
int x;

void Q(int z){
    z += x;
    q(z);
}

void P(int y){
    int x = y * 2;
    p(x);
    y = x -2;
    Q(y);
}

int main(){
    x = 3;
    P(x);
    p(x);
    return 0;
}
