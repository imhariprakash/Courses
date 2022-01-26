#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
    char str[100], word[20], *ptr;
    printf("Enter the string: ");
    fgets(str,100,stdin);
    printf("Enter the word: ");
    scanf("%s",word);
    ptr =(char*) strstr(str,word);
    printf("%s is found in %s at %s.\n",word,str,ptr);
}