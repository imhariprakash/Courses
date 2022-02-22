#include<stdio.h>
#include<stdlib.h>

void getArray(int array[], int n){
    for(int i = 0; i < n; i++){
        printf("Enter element number %d: ",(i+1));
        scanf("%d",&array[i]);
    }
}

void printArray(int array[], int n){
    for(int i = 0; i < n; i++){
        printf("\nEnter element number %d : %d",(i+1), array[i]);
    }
}

int getmin(int array[], int n){
    int i, min = 1000000000,ind = 0;
    for(i = 0; i < n; i++){
        if(min > array[i]){
            ind = i;
            min = array[i];
        }
    }
    array[ind] = 100000000;
    return(min);
}

int main(){
    int n,m,min;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array, n);
    printf("Enter which min: ");
    scanf("%d",&m);
    for(int i = 0; i < m; i++){
        min = getmin(array, n);
    }
    printf("%d\n\n",min);
}