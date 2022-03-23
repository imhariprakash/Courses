#include<stdio.h>
int main() {
    int x=1,y=0;
    int count=5;
    for (; count>0;) {
        switch(count--)
        {
        case 4:
            printf("%d",x);
        case 3:
            printf("%d",y);
        case 2:
            printf("%d",x);
        case 1:
            printf("%d",y);
        case 0:
            printf("%d ",x);
        }
    }   
}