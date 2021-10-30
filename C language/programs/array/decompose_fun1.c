#include <stdio.h>
int sum(int, int);
int main(void){
    int result;
    result = sum(10, 4);
    printf("The sum  is %d.\n", result);
    return 0;
}

int sum(int x, int y) {
    int compute;
    compute = x+y;
    return 'a';
}
