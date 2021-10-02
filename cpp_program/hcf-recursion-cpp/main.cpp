/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
int hcf(int a,int b)
{
    if(b != 0)
    return(hcf(b,a%b));
    else
    return a;
}
int main()
{
    int a,b,hc;
    cin>>a>>b;
    hc=hcf(a,b);
    cout<<hc;
    return 0;
    
}
