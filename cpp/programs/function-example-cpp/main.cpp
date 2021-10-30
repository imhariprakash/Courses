/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
double area(const double r,const double pi=3.14)
{
return(pi*r*r);
}
int main ()
{
double rad,res;
cout<<"\nEnter Radius :";
cin>>rad;
res=area(rad);
cout << "\nThe Area of Circle ="<<res;
return 0;
}
