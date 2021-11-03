#include <stdio.h>

int main(int argc, char *argv[]) {
    int i;
    printf("I have %d arguments from the command line: \n", argc);
    for (i = 0; i<argc; i++) {
        printf("Argument %d: %s\n", i, argv[i]);
    }
    
    return 0;
}
