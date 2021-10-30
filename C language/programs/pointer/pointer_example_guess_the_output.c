#include <stdio.h>

int main(void) {
    int i;
    int *iAdr = &i;

    *iAdr = 10;

    printf(" i = %d\n", i);
    printf(" *iAdr = %d\n", *iAdr);

    *iAdr = *iAdr - 2;
    printf(" i = %d\n", i);
    printf(" *iAdr = %d\n", *iAdr);

    (*iAdr) += 1;
    printf(" i = %d\n", i);
    printf(" *iAdr = %d\n", *iAdr);

    return 0;
}

/* answer
i = 10
 *iAdr = 10
 i = 8
 *iAdr = 8
 i = 9
 *iAdr = 9
*/


/*
#include <stdio.h>
void myFunction(int);
int main(void) {
  int i = 10;
  myFunction(i);
  printf("%d", i);
  return 0;
}

void myFunction(int j) {
    j = 20;
}

*/


/* answer

10
*/
