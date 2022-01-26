#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int find_nth_term(int n, int a, int b, int c) {
  int i,array[n];
  array[0]=a;
  array[1]=b;
  array[2]=c;
  for(i = 3;i < n; i++)
  {
      array[i]=array[i-1] + array[i-2] + array[i-3];
  }
  return(array[n-1]);
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}
