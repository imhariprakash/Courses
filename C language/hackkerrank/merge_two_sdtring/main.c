/* we are adding two strings - the compiler can't able to tell where the program ends- since we are giving "hari"
not as "hari\0". So the compiler doesn't know the end. So the dilemma happens.
solution: after finishing the loops give \0 to help the compiler to know about the end of the program    */

#include<stdio.h>
#include<string.h>
int main()
{
int i=0,j=0;
char a[]="hari",b[]="prakash",c[20]; //if given c[12] one more than 11 - no need for \0 assigning.
while((i+j)<(strlen(a)+strlen(b)))
{
if((i+j)<(strlen(a))){
c[i+j]=a[i];
i++;
}
else {
c[i+j]=b[j];
j++;
}
}
c[i+j]='\0';
printf("%s",c);
return 0;
}


