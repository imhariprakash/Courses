#include<stdio.h>
#include<stdlib.h>

#define ONE 1
#define TWO ONE+ONE
#define THREE TWO+ONE

int main()
{
    printf("%d %d %d\n",ONE,TWO,THREE);
}