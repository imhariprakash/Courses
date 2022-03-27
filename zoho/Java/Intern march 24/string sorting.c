#include<stdio.h>
#include<string.h>
int swapstring(char a[], char b[]){
    int x = strlen(a);
    int y = strlen(b);
    
    for(int i = 0, j = 0; i < x || j < y; i++, j++){
        char temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
    a[y] = '\0';
    b[x] = '\0';
}

int main(){
    int n;
    scanf("%d",&n);
    char a[n][100];
    for(int i=0;i<n;i++){
        scanf("%s",a[i]);
    }
    
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(strlen(a[j])<strlen(a[i])){
                swapstring(a[i], a[j]);
            }
            else if(strlen(a[i])==strlen(a[j])){
                int l;
                for(l=0;a[i][l]==a[j][l];l++);
                if(a[i][l]>a[j][l]){
                    swapstring(a[i],a[j]);
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        printf("%s  ",a[i]);
    }
}