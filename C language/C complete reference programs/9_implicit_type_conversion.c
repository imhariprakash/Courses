#include<stdio.h>
#include<stdlib.h>

int main()
{
   int x=77;
   char ch='A';
   float f=77.0;
   ch=x;
   printf("%c  ",ch);
   x=f;
   printf("%d  ",x);
   f=ch;
   printf("%f  ",f);
   f=x; 
   printf("%f  ",f);
 }
