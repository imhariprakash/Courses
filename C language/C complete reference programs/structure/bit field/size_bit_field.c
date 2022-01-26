#include <stdio.h>
#include <string.h>

/* define simple structure */
struct {
   unsigned int widthValidated;
   unsigned int heightValidated;
   unsigned int base;                //16 bytes
   unsigned int vol;
} status1;

/* define a structure with bit fields */
struct {
   unsigned int widthValidated : 7;
   unsigned int heightValidated : 7;             //must be limited to a byte
   unsigned int base : 7;
   unsigned int vol : 7;          //uses the same 4 byte for all.
} status2;
 
int main( ) {
   printf( "Memory size occupied by status1 : %d\n", sizeof(status1));
   printf( "Memory size occupied by status2 : %d\n", sizeof(status2));
   return 0;
}