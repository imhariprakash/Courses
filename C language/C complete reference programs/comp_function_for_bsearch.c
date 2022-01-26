#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

int comp(const void *ch,const void *ch1)
{
    return(*(char*)ch - *(char*)ch1);
}


int main()
{
    char ch1='c',ch2='a';
    char *ptr,*pt1=&ch1,*pt2=&ch2;  //ch1,ch2 's address in pt1,pt2 to check our function comp -- working very fine

    printf("%d\n",comp(pt1,pt2));          //check the function comp  - fine

}