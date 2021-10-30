#include <stdio.h>

int main()
{
    int arr[3]={12,13,14};
    int *ptr=arr;
    *ptr=2;
    *(ptr+1)=3;
    *(ptr+2)=4;
    printf("%p\n",ptr);
    printf("%d %d %d",arr[0],arr[1],arr[2]);
    return 0;
}
