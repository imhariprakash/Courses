/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
#include<stdio.h>
#include<conio.h>
#include<string.h>
using namespace std;
int main()
{
char str[50];
cout<<"Enter a string : ";
fgets(str,50,stdin);
cout<<"You entered: ";
puts(str);
return(0);
}
