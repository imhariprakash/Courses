#include<stdio.h>
#include<stdlib.h>
char* createString(char*str,int n)
{
    str=(char*)malloc(n*sizeof(char));
    return str;
}
char* getString(char*str)
{
    scanf("%s",str);
    return str;
}
char* printString(char*str)
{
    printf("%s\n",str);
}
int main()
{
    int a,b;
    char *str1,*str2;
    printf("Enter the number of letters in string1: ");
    scanf("%a",&a);
    printf("Enter the number of letters in string2: ");
    scanf("%a",&b);
    str1=createString(str1,a);
    str2=createString(str2,b);
    str1=getString(str1);
    str2=getString(str2);
    printString(str1);
    printString(str2);
}
