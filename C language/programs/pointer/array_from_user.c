#include <stdio.h>
int main(void){
    int array[3];
    int readValue = 0;
    int cellNumber = 0;
    int i = 0;
    for(i = 0 ; i < 3 ; i++){
        printf("Enter a value:");
        scanf("%d", &readValue);
        array[cellNumber] = readValue;
        printf("Cell number %d contains %d\n", cellNumber, array[cellNumber]);
        cellNumber = cellNumber + 1;
    }
    return 0;
}
