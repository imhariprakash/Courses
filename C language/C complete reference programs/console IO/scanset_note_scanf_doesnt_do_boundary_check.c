#include<stdio.h>
#include<stdlib.h>

int main()
{
    char arr1[100],arr2[100],arr3[100],arr4[10];
    //scanf("%[a-z A-Z]",arr1); //include space also
    //printf("%s\n",arr1);
    // scanf("%[a-zA-Z]",arr2); //doesn't include space also
    // printf("%s\n",arr2);
    // scanf("%[^0-9]",arr3);  //eliminate digits
    // printf("%s\n",arr3);
    // scanf("%[^\n]",arr4);  //eliminate new line char
    // printf("%s %d\n",arr4,(int)sizeof(arr4));
    scanf("%s",arr4);
    printf("%s",arr4);

    //  caution: scanf using scanset doesn't do any boundary check see 4 th example 

}