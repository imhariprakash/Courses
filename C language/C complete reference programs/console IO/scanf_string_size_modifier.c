#include<stdio.h>
#include<stdlib.h>

int main()
{
    char arr[100],arr2[100];
    int a;
    scanf("%20s",arr); //takes 20 char alone remaining will be in buffer space
    scanf("%10s",arr2);
    printf("%s\n%s\n",arr,arr2);
}