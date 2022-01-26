#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  int i,j,and,or,exor,result,max_and=0,max_or=0,max_exor=0;
  for(i=1;i<n;i++)
  {
      for(j=i+1;j<=n;j++)
      {
          and = i & j;
          or = i | j;
          exor= i ^ j;
          if(and > max_and && and < k)
          max_and=and;
          if(or > max_or && or < k)
          max_or=or;
          if(exor > max_exor && exor < k)
          max_exor=exor;  
      }
  }
  printf("%d\n",max_and);
  printf("%d\n",max_or);
  printf("%d",max_exor);
  
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
