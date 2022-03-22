#include<Stdio.h>

typedef int(*FP)(int, int);

int sum(int a, int b) {
    return a + b;
}

int mod(int a, int b) {
    return a % b;
}

FP get(char c) {
    if(c == '+')
        return sum;
    else 
        return mod;
}

int main() {
    FP fun = get('+');
    printf("%d\n",fun(1,2));
    fun = get('%');
    printf("%d\n",fun(1,2));
    fun = &sum;
    printf("%d\n",fun(1,2));
}