/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;
inline float simpleinterest(float p1,float n1, float r1)
{
float si1=(p1*n1*r1)/100;
return(si1);
}
int main ()
{
float si,p,n,r;
cout<<"\nEnter the Principle Amount Rs. :";
cin>>p;
cout<<"\nEnter the Number of Years :";
cin>>n;
cout<<"\nEnter the Rate of Interest :";
cin>>r;
si=simpleinterest(p,n,r);
cout << "\nThe Simple Interest = Rs."<<si;
return 0;
}