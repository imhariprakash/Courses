#include<stdio.h>
int main(){
    int i = 60;
    int *j = &i;
    if(i == 60){
        printf("Hello.");
    }
    if(i = 140){
        printf("Hi.");
    }
    printf("%d",*j);
}

// Hello.Hi.140