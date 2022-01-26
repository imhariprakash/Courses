#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct
{
    int a,b,c;
}var;

void func(var num)   //as the type of struct is defined using type def no need for struct  - just tag and object
{
    printf("%d %d %d\n",num.a,num.b,num.c);
}

int main()
{
    var num={1,2,3};
    func(num);
}