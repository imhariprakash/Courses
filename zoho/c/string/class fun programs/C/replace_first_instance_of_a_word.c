/*
Write a C program to input any string from user and remove first occurrence of a given word from string. Write a function to remove first occurrence of a word from the string. How to remove first occurrence of a word from the string in C programming. Logic to remove first occurrence of a word from given string.
Example
Input
Input string : Learn programming at Codeforwin.
Input word to remove : Learn
Output
String after removing 'Learn': 
programming at Codeforwin.
*/




#include<stdio.h>
#include<string.h>

int main()
{
    int i,wlen;
    char str[100],word[20],*ptr;
    printf("Enter the sentence: ");
    scanf("%[^\n]s",str);
    getchar();
    printf("Enter the word: ");
    scanf("%[^\n]s",word);
    getchar();
    printf("%s\n%s\n",str,word);
    ptr = strstr(str,word);
    if(ptr == NULL) 
    {
        printf("Word not found.\n");
        return 0;
    }
    wlen = strlen(word);
    for(i=0; *(ptr+wlen+1+i)!= '\0';i++)
    {
        *(ptr+i) = *(ptr+wlen+1+i);
    }
    ptr[i] = '\0';
    printf("%s\n",ptr);

}