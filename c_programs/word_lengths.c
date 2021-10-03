#include<stdio.h>
int main()
{
    int n,i,l,j,count[10]; // get some words as input then displays how many words has how many letters(from 1 to zeros leters
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
        count[j-1]++;
    }
    for(i=0;i<10;i++)
    printf("Number of words having %d letters is %d.\n",i+1,count[i]);
    return 0;
}
