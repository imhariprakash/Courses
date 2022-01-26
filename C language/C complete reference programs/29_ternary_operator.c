/* Magic number program #4. */
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    1>2 ? printf("Hello\n") : printf("Hi\n");  //statement
    int y=2>3 ? 1:0;
    printf("y: %d\n",y);  //assignment
    int t=0;
    t ? printf("Not zero\n") : printf("Zero\n");
    
}