#include<stdio.h>

struct var{
    int a;
    int b;
};

/*
struct{
    int a;
    int b;
}var;

int main()
{
    struct var vari;    // error - no tag - for this need to define  //try to use tag format instead of typedef and var
} 

*/

int main()
{
    struct var variable;
    variable.a=1;
    printf("%d\n",variable.a);
}