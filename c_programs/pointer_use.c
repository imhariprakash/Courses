#include<stdio.h>
int main()
{
int a=121;//int
char b='a';//char
double c=12.34;//double
int d={1,2,3,4};//int array   //though unnecessary we can put d[5],e[5],f[6],g[3][6]
double e={1.2,1.3,1.4,1.5};//double array
char f={'a','b','c','d','e'};//char array
char g={"hello","world"};//string array
int *ipoi=&a;//int pointer
char *cpoi=&b;//char pointer
double *dpoi=&c;//double pointer
int *iapoi=&d;
char *capoi=&f;
char *sapoi=&g;
double *dapoi=&e;
printf("%p %p %p\n",ipoi,cpoi,dpoi);
printf("%p %p %p %p\n",iapoi,capoi,dapoi,sapoi);

//dereferencing
printf("%d, %c, %lf",*ipoi,*cpoi,*dpoi);

return 0;
}
