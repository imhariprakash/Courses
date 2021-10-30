/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
int main()
{
    int n,b;
    cin>>n;
    switch(n)
    {
        case 0:
        cout<<"The number is 0";
        break;
        default:
        cout<<"The number is non zero"<<endl;
        b=n%2;
        switch(b)
        {
            case 0 :
            cout<<"The number is even";
            break;
            case 1 :
            cout<<"The number is odd";
            break;
        }
    }
        return 0;
    }