#include<stdio.h>
#include<stdlib.h>

#define MAX 10

int main()
{

#if MAX > 99
    printf("Greater than 99.\n");
#elif MAX > 90
    printf("Greater than 90.\n");
#elif MAX < 100
    printf("Less than 100.\n");
#else
    printf("Hello world\n");
#endif

}