#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    /*
    char* arr="   string";
    for( ; *arr == ' ' ;arr++ );
    printf("%s",arr);
    */
    char arr[15]="  Hello";
    char* a=arr;
    for(;*a==' ';a++);
    printf("%s",a);
}