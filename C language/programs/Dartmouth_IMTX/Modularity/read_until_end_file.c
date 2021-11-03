#include <stdio.h>

int main(void) {
    FILE *ifile;  
    int i, num, sum;
    int N, done, message;
    
    ifile = fopen("my_third_file.txt", "r"); 
                                
    N=0;
    sum = 0;
    done = 0; 
    
    while (!done) {
        message = fscanf(ifile, "%d", &num);
        if (message == EOF) done = 1;
        else {
            printf("I read %d from the file. \n", num);
            sum += num;
            N++;
        }
    }
    
    fclose(ifile);
    
    printf("There are %d numbers in the file.\n", N);
    printf("The sum of the numbers read is %d.\n", sum); 
    printf("The average is %.2f.", (float) sum / N);
    
    return 0;
}
______________________________________________________________________________________

Need a file "my_third_file.txt" here. For example

56  3  8  -11  0  -45  55  2  78

______________________________________________________________________________________

More elegant version:

#include <stdio.h>

int main(void) {
    FILE *ifile;  
    int i, num, sum;
    int N;
    
    ifile = fopen("files/my_third_file.txt", "r"); 
                                
    N=0;
    sum = 0;
    
    while (fscanf(ifile, "%d", &num) != EOF) {
        printf("I read %d from the file. \n", num);
        sum += num;
        N++;
    }
    
    fclose(ifile);
    
    printf("There are %d numbers in the file.\n", N);
    printf("The sum of the numbers read is %d.\n", sum); 
    printf("The average is %.2f.", (float) sum / N);
    
    return(0);
}
