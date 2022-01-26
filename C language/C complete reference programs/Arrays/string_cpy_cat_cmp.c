#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    char arr1[15]="hello",arr3[]="hellooo",arr2[29];
    strcpy(arr2,arr1);
    printf("%s %s\n",arr1,arr2);
    strcat(arr2,arr1);
    printf("%s\n",arr2);
    printf("%d\n",strcmp(arr1,arr3));
    printf("%d\n",(int)strlen(arr2));
    char *temp=strchr(arr2,'e');
    printf("%s\n",temp);
    temp=strstr(arr2,"ooo");
    printf("%s\n",temp);
}