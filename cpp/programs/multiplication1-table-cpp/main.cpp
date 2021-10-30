/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
int main(void)
{
cout<< "A multiplication table:" <<endl <<" 1\t2\t3\t4\t5\t6\t7\t8\t9" <<endl<< "" <<endl;
for(int c = 1; c < 10; c++)
{
cout<< c << "| ";
for(int i = 1; i< 10; i++)
{
cout<<i * c << '\t';
}
cout<<endl;
}
return 0;
}
