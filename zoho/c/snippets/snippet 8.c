#include<stdio.h>
int main(){
    int arr[] = {5,10,17,4,15,3,3,1,2};
    int count = 0, sum = 20, n = 10;
    for(int i = 0; i < n; i+=2){
        for(int j = i + 1; j < n; j++){
            if(arr[i] + arr[j] == sum){
                count += count++;
            }
        }
    }
    printf("%d",count);
}