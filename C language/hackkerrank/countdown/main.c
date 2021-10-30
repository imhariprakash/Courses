/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <conio.h>
#include<stdlib.h>

int main()
{
    int h,s,m;
    printf("enter hours :");
    scanf("%d",&h);
    printf("\nenter minutes :");
    scanf("%d",&m);
    printf("\nenter seconds :");
    scanf("%d",&s);
    while(1)
    {
        printf("\n %d: %d : %d",h,m,s);
        sleep(1);
        s--;
        if(s==0&&m!=0)
        {
            s=59;
            m--;
        }
        if(s==0&&m==0&&h!=0)
        {
            h--;
            s=59;
            m=59;
        }
        if(h==0&&m==0&&s==0)
        {
            exit(0);
        }
        getch();
    }
       return 0; 
       
}

