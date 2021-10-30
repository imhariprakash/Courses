/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int nterm(int n, int a, int b, int c) {
  if(n==1)
  return a;
  else if(n==2)
  return b;
  else if(n==3)
  return c;
  else {
  return(nterm(n-1,a,b,c)+nterm(n-2,a,b,c)+nterm(n-3,a,b,c));
  }
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = nterm(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}