void doSomething(int);
int main(){
    //! showMemory(start=65520)
    int a = 10;
    int b = 11;
    int f = 14;
    int g = 15;
    doSomething(b);
    printf("f: %d\n",f);
    return(0);
}

void doSomething(int h)
{
        int a = 20;

        int c = 12;
        int d = 13;
        int e = a + c;
        c = h + d;
        printf("c: %d\n",c);
        printf("e: %d\n",e);
}
