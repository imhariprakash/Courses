#include<stdio.h>
int main(){
    int i = 10, j = 30, k = 0, p = 0;
    for(i = 0; i < 10; i++){
        printf("%d",i);
        for(j = 30; j > 15; j--){j = k--;}
        for(p = 0; p < 12; i++){p = k++;}
    }
    printf(" %d",k);
}

// output : 013 (where i = 0(first in loop printed), j = 13 - after end of loops)