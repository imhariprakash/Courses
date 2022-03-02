#include<stdio.h>

int main(){
    int array[3][3]= {1,2,3,4,5,6,7,8,9};
    function(array);
    printf("%d",array[1][3]);
    printf("\n\n%d %d %d %d %d %d %d %d %d %d",array[0][0],array[0][1],array[0][2],array[1][0],array[1][1],array[1][2],array[2][0],array[2][1],array[2][2]);
    return 0;
}

void function(int b[][2]){
    --b;
    b[1][3] = 9;
}

//output - 9