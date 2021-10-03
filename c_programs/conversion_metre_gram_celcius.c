#include<stdio.h>
#include<math.h>
void distance(double a){
    printf("%.6lf ft\n",3.2808*a);
}
void weight(double a){
    printf("%.6lf lbs\n",0.002205*a);
}
void temperature(double a){
    printf("%.6lf f\n",(32+(1.8*a)));
}
int main(){
    int n,i;double a;char b;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%lf %c",&a,&b);
        if(b=='g')
        weight(a);
        else if(b=='c')
        temperature(a);
        else
        distance(a);
    }
    return 0;
}
