#include<stdio.h>
#include<stdlib.h>

int main()
{
    printf("ab");
    printf("\bsi\n");
    printf("\rha\n");     

    /*
    "ab\n"
    "\b\b\bsi"

    out: 
        ab
        si 
        reason : since gone to next line - wont work.
    */

     /*
    "ab"
    "\b\b\bsi"

    out: 
        si 
        reason : no next line delete a and b so si alone.
    */


     /*
    "ab"
    "\bsi"
    "\rha"

    out: 
        step 1: ab
        step 2: asi
        step 3: replace letter by letter a by h s by a  - > hai
        reason : since gone to next line - wont work.
    */

   /*
    "ab"
    "\bsi\n"
    "\rha\n"

    out: 
        step 1: ab
        step 2: asi
        step 3: next line so
        asi
        ha    as newline is there \r wont have effect
    */

}