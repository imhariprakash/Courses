#include<stdio.h>
int main(){
    char* str[] = {"11222","44433","99888","00033"};
    char** sp[] = {str + 1, str, str + 3, str + 2};
    char***ps;
    ps = sp;
    ++ps;
    printf("%s",**++ps+2);
}

// 033