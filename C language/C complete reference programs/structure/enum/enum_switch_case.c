#include<stdio.h>
#include<stdlib.h>
#include<string.h>

enum decimal{zero,one,two,three,four,five,six,seven,eight,nine};    //use typedef enum {....}var; 

//enum{.....}var; -> enum var variable; -> not working -> tag important. -> don't forget it or use enum;

int main()
{
    enum decimal num;
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    num=n;
    switch(num)
    {
        case zero:
            printf("Zero\n");
            break;
        case one:
            printf("One\n");
            break;
        case two: 
            printf("Two\n");
            break;
        case three:
            printf("Three\n");
            break;
        case four:
            printf("Four\n");
            break;
        case five:
            printf("Five\n");
            break;
        case six:
            printf("Six\n");
            break;
        case seven:
            printf("Seven\n");
            break;
        case eight:
            printf("Eight\n");
            break;
        case nine:
            printf("Nine\n");
            break;
    }
    
    
}