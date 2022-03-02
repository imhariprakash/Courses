#include<stdio.h>

int main(){
    int arr[] = {7,90,51};
    int cat[] = {2,3,40};
    int n = 3;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(arr[i] % cat[j] == 0){
                int temp = arr[j];
                arr[j] = cat [i];
                cat[i] = temp;
            }
        }
    }

    for(int i = 0; i < n; i++){
        printf("%d,",cat[i] + arr[i]);
    }
}

// 5,97,91,