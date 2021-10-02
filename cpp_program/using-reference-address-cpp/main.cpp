/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
int main()
{
int n1=150;
int &n1ref=n1;
cout<<"\nThe Value of N1 = "<<n1<<" and n1Reference = "<<n1ref;
n1ref++;
cout<<"\nAfter n1 increased the Value of N1 = "<<n1;
cout<<" and n1Reference = "<<n1ref;
return(0);
}
