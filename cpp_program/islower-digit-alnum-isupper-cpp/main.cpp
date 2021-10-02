/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
#include<stdio.h>
#include<ctype.h>
using namespace std;
int main()
{
    int a=isalnum('a');
    int b=isalnum('4');
    cout<<a<<"\t"<<b<<endl;
    a=isalpha('A');
    b=isalpha('2');
    cout<<a<<"\t"<<b<<endl;
    a=isdigit('9');
    b=isdigit('A');
    cout<<a<<"\t"<<b<<endl;
    a=islower('a');
    b=islower('A');
    cout<<a<<"\t"<<b<<endl;
    a=isupper('a');
    b=isupper('A');
    cout<<a<<"\t"<<b<<endl;
    char c=toupper('a');
    cout<<c<<endl;
    c=tolower('A');
    cout<<c<<endl;
}
