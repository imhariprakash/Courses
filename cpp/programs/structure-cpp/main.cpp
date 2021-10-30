/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
struct student{
    int age;
    float height,weight;
}balu;
int main()
{
 cout<<"Enter the age: ";
 cin>>balu.age;
 cout<<endl<<"Enter the height: ";
 cin>>balu.height;
 cout<<endl<<"Enter the weight: ";
 cin>>balu.weight;
 cout<<endl<<"The values entered for age,height and weight are"<<endl<<balu.age<<"\t"<<balu.height<<"\t";
 cout<<balu.weight;
 
}
