/*Your job is to find the length of the longest word in a text with no punctuation or special characters of any kind - only contains words. To do so, please write a C-program that takes as a input first the number of words in a text, followed by all of the words in the text. The output of your program should be the length of the longest word in the text.

To simplify your program, you can assume that the longest word will not exceed 100 characters.



Examples
Input:
14
This is a simple example text
we have to find the largest word length
Output:
7
Input:
7
All cats are grey in the dark
Output:
4      */

#include<stdio.h>
int main()
{
    int n,i,l,j,count[10],lon=0; // get some words as input then displays how many words has how many letters(from 1 to zeros leters
    char word[11];
    scanf("%d",&n);
    for(i=0;i<10;i++)
    count[i]=0;
    for(i=0;i<n;i++)
    {
        l=0,j=0;
        scanf("%s",word);
        while(word[l]!='\0')
        {
                j++;
                l++;
        }
        if(j>lon)
            lon=j;
    }
    printf("%d",lon);
    return 0;
}
