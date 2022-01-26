/* Magic number program #4. */
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
 int magic; /* magic number */
 int guess; /* user's guess */
 magic = rand(); /* generate the magic number */
 printf("Guess the magic number: ");
 scanf("%d", &guess);
 if(guess == magic) {
 printf("** Right ** ");
 printf("%d is the magic number", magic);
 }
 else if(guess > magic)
 printf("Wrong, too high");
 else printf("Wrong, too low");
 return 0;
}