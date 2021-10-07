#include <stdio.h>
int main(){
    //! showMemory(start=65520)
    int a = 10;
    int b = 11;
    {
        int c = 12;
        int d = 13;
        int e = a + c;
        c = b + d;
        printf("c: %d\n", d);
        printf("e: %d\n", e); // c,d,e are only accessible inside the block. but a,b are accessible.but f and g
        //are not since not yet declared
    }
    int f = 14;
    int g = 15;
    printf("f: %d\n",f);
    printf("g: %d", g);
}
