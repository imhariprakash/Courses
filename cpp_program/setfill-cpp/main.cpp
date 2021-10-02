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
    int pay,da,hra,gpf, tax, gross, np;
    cout<<"Enter Basic Pay: ";
    cin>>pay;
    cout<<"Enter D.A : ";
    cin>>da;
    cout<<"Enter H.R.A : ";
    cin>>hra;
    gross = pay+da+hra; // sum of basic, da nad hra
    gpf = (pay+da) * 0.10; // 10% 0f basic and da
    tax = gross * 0.10; //10% of gross pay
    np = gross - (gpf+tax); //netpay = earnings - deductions
    cout<<setw(25)<<"Basic Pay :"<<setw(10)<<setfill('_')<<pay<<endl;
    cout<<setw(25)<<"Dearness Allowance :"<<setw(10)<<setfill('_')<<da<<endl;
    cout<<setw(25)<<"House Rent Allowance :"<<setw(10)<<setfill('_')<<hra<<endl;
    cout << setw(25) << "Gross Pay : " << setw(10)<<setfill('_') << gross << endl;
    cout << setw(25) << "G.P.F : " << setw(10) <<setfill('_')<< gpf << endl;
    cout << setw(25) << "Income Tax : " << setw(10)<<setfill('_')<< tax << endl;
    cout << setw(25) << "Net Pay : " << setw(10)<<setfill('_') << np << endl;
return 0;    
}
