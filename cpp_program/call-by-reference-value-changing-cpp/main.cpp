/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
void display(int &a)//explicit conversion of int to address.
{
    a+=1;
}
int main()
{
    int a=10;
    cout<<a<<endl;
    display(a);
    cout<<a<<endl;
}