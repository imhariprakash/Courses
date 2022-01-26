#include<stdio.h>
#include<stdlib.h>

int main()
{
    int* p=0;
    //*p=12;
    //printf("%p\n",p); // output - > (nil)
    //printf("%d %p",*p,p); // core dumped since null position doesn't has any object.
}