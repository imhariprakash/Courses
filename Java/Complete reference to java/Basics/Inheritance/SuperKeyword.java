class A{
    int i;
}

class B extends A{
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println(super.i);
        System.out.println(i);
    }
}


class SuperKeyword{
    public static void main(String[] args){
        B obj = new B(1, 2);
        obj.show();
    }
}