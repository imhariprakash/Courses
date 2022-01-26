#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    switch(n){
        case 1:
            printf("H");
            switch(n){
                case 6:
                    printf("*");
                case 1:
                    printf("*");
                    break;
                case 3:
                    printf("*");
                case 4:
                    printf("*");
                case 5:
                    printf("*");
                    //break;
                default:
                    printf("Hello");
                    break;
    }
        case 2:
            printf("A");
        case 3:
            printf("R");
        case 4:
            printf("I");
        case 5:
            printf("PRAKASH");
            //break;
        default:
            printf("Hello");
    }
    
    
}