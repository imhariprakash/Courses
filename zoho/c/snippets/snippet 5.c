#include<stdio.h>

int main(){
    int i = 10, j = 9, k = 4, l = 7, m = 0;
    while(k){
        m = --i + j++ - k-- + ++l;
        //printf("%d,%d,%d,%d,%d\n",i,j,k,l,m);
    }
    printf("\n\n%d,%d,%d,%d,%d\n",i,j,k,l,m);
}

// 6,13,0,11,28 - end result



// each loop

// 9,10,3,8,22
// 8,11,2,9,24
// 7,12,1,10,26
// 6,13,0,11,28