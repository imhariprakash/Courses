#include<stdio.h>
int *get_array()
{
int i;
static int *arr[6];
for(i=0;i<6;i++)
scanf("%d",arr+i);
return arr;
}
int main()
{
int i;
int *a;
a=get_array();
for(i=0;i<6;i++)
printf("%d ",*(a+i));
return 0;
}
