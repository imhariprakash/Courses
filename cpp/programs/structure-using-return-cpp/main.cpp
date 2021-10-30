/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;

struct student{
int age,height;
char name[30];
};

student input()
{
    student e;
    cout<<"Enter the name: ";
    cin>>e.name;
    cout<<endl<<"Enter the age: ";
    cin>>e.age;
    cout<<endl<<"Enter the height: ";
    cin>>e.height;
    return(e);
}

int main()
{
    student e;
    e=input();
    cout<<"The details entered are"<<endl;
    cout<<e.name<<"\t"<<e.age<<"\t"<<e.height;
    return 0;
}

