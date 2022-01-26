#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>  //for isdigit ctype need to be used else implicit declaration warning

int compareDigit(const char* a,const char* b)
{
    //since input is a string - just ignore type
    if(atoi(a)==atoi(b))
        return 0;
    else
        return 1;
}

void compareString(const char* a,const char* b,int (*cmp)(const char* a,const char* b))
{
    //using const for precaution - functions must not change input - convention by using const
    if(!(*cmp)(a,b))
        printf("Equal!\n");
    else
        printf("Not equal!\n");
}

int main()
{
    char str1[100],str2[100];
    printf("Enter string1: ");
    scanf("%s",str1);
    printf("Enter string2: ");
    scanf("%s",str2);
    if(isdigit((char)*str1))
    {
        printf("Testing digits for equality.\n");
        compareString(str1,str2,compareDigit);
    }
    else
    {
        printf("Testing strings for equality\n");
        compareString(str1,str2,strcmp);
    }
    
}