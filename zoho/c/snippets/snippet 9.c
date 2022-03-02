#include<stdio.h>

int func(int p, int q){
    int count = 0;
    while(p > q){
        count++;
        p--;
        q++;
    }
    return count;
}

int call(int p, int q){
    return(func(++p + 1, q++));
}

int main(){
    char p = 'A', q = 'Z';
    int z = call(q,p);
    printf("%d",z++);
    return 0;
}

//14