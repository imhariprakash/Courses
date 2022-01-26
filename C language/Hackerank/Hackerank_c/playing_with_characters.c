#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch,str1[100],str2[100],temp;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    scanf("%c",&ch);
    scanf("%s",str1);
    scanf("%c",&temp);
    fgets(str2,sizeof(str2),stdin);
    printf("%c\n%s\n%s",ch,str1,str2); 
    return 0;
}