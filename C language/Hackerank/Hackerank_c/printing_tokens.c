#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char s[1000];
    int i;
    scanf("%[^\n]%s",s);  //scanset - not equal to \n
    for(i=0;i<strlen(s);i++)
    {
        if(s[i]==' ')
        {
            printf("\n");
        }
        else
        {
            printf("%c",s[i]);
        }
    }
    //Write your logic to print the tokens of the sentence here.
    return 0;
}