class A{
    public int i, j;
    public void showij(){
        System.out.println("i="+i+" j="+j);
    }
}

class B extends A{
    public int k;
    public void showk(){
        System.out.println("k="+k);
    }
    public void sum(){
        System.out.println("i+j+k="+(i+j+k));
    }
}

public class DemoInheritance1{
    public static void main(String[] args){
        A obj = new A();
        obj.i = 10;
        obj.j = 20;
        obj.showij();
        B obj2 = new B();
        obj2.k = 30;
        obj2.showk();
        obj2.sum(); // i and j - unassigned - default 0
        obj2.i = 20;
        obj2.j = 10;
        obj2.showij();  // calling A's method from B which extends A
        obj2.sum(); // i and j - assigned
    }
}