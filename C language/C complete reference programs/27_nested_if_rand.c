/* Magic number program #3. */
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
 int magic; /* magic number */
 int guess; /* user's guess */
 magic = rand(); /* get a random number */
 printf("Guess the magic number: ");
 scanf("%d", &guess);
 if (guess == magic) {
 printf ("** Right **");
 printf(" %d is the magic number\n", magic);
 }
 else {
 printf("Wrong, ");
 if(guess > magic) printf("too high\n"); /* nested if */
 else printf("too low\n");
 }
 return 0;
}