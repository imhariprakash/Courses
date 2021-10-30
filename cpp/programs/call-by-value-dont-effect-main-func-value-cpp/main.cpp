/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
void display(int x)
{
int a=x*x;
cout<<"\n\nThe Value inside display function (a * a):"<<a;
}
int main()
{
int a;
cout<<"\nExample : Function call by value:";
cout<<"\n\nEnter the Value for A :";
cin>>a;
display(a);
cout<<"\n\nThe Value inside main function "<<a;
return(0);
}
