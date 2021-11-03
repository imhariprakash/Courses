Code discussed in this video:

#include <stdio.h>
#include <string.h>

int main(void) {
    FILE *ofile;  /* You can use any variable name here, just make sure you 
                     include the '*'. */
    char filename[] = "my_first_output_file.txt";
    int num, selection;
    selection = 1;
    
    /* Check whether the file already exists: */
    ofile = fopen(filename, "r"); 
    if (ofile != NULL) {
        printf("You already have a file named %s.\n", filename);
        fclose(ofile);
        printf("Do you wish to (1) append or (2) overwrite? Enter 1 or 2: \n");
        scanf("%d", &selection);
    }

    if (selection == 1) {
        ofile = fopen(filename, "a"); 
    } else {
        ofile = fopen(filename, "w"); 
    }
    
    do {
        printf("Please enter a grade. Enter -1 to quit: \n");
        scanf("%d", &num);
        if (num != -1)
            fprintf(ofile, "%d ", num);        
    } while (num != -1);
    fclose(ofile);
    
    return 0;
}
