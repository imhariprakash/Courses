#include<stdio.h>

#include<conio.h>

int main() {
  int n = 5;
  for (int i = 1; i <= n; i++) {
    for (int j = n; j >= 1; j--) {
      if (j <= i)
        printf("%d ", j);
      else
        printf("  ");
    }
    printf("\n");
  }
  return 0;
}