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

int getMax(int array[], int n){
    int i, max = -1000000000,ind = 0;
    for(i = 0; i < n; i++){
        if(max < array[i]){
            ind = i;
            max = array[i];
        }
    }
    array[ind] = -100000000;
    return(max);
}

int main(){
    int n,m,max;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int array[n];
    getArray(array, n);
    printf("Enter which max: ");
    scanf("%d",&m);
    for(int i = 0; i < m; i++){
        max = getMax(array, n);
    }
    printf("%d\n\n",max);
}