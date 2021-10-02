/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int i,j;
    for(i=1;i<11;++i)
    {
        for(j=1;j<17;++j)
        {
            cout<<i<<setw(2)<<"*"<<j<<setw(2)<<"="<<i*j<<setw(3)<<"  ";
        }
        cout<<"\n";
    }
    return 0;
}
