#include<stdio.h>
void add_3(int *ptr)
{
*ptr=2;
*(ptr+1)=3;
*(ptr+2)=4;
}
int main()
{
int arr[3]={12,13,14};
add_3(arr);
printf("%d %d %d",arr[0],arr[1],arr[2]);
}
