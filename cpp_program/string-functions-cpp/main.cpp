/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
using namespace std;
int main()
{
    char s[50],t[50];
    fgets(s,50,stdin);
    strcpy(t,s);
    puts(t);
    cout<<strlen(s)<<endl;//including /0 character it is counting!
    int a=strcmp(s,t);
    cout<<a<<endl; // positive value if string1 is lexicographically greater, negative if string 2,0 if equal.
    char q[10]="hello",z[10]=",good";
    strcat(q,z);
    cout<<q<<endl;
    cout<<strlwr(q)<<endl;
    cout<<strupr(q)<<endl;
    return 0;
}
