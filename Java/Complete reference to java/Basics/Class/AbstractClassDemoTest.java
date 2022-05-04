abstract class AbstractClassDemo{
    public int num1;
    public int num2;
    public abstract int add();
    public abstract int sub();
    public abstract int mul();
    public abstract int div();

    public AbstractClassDemo(){
        System.out.println("AbstractClassDemo constructor");
    }

    public void display(){
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("add = "+add());
        System.out.println("sub = "+sub());
        System.out.println("mul = "+mul());
        System.out.println("div = "+div());
    }
}

class ConcreteClassDemo extends AbstractClassDemo{ 

    public ConcreteClassDemo(int num1, int num2){
        super.num1 = num1;
        super.num2 = num2;
    }

    public int add(){
        return num1+num2;
    }

    public int sub(){
        return num1-num2;
    }

    public int mul(){
        return num1*num2;
    }

    public int div(){
        return num1/num2;
    }
}

public class AbstractClassDemoTest{
    public static void main(String[] args){
        AbstractClassDemo obj = new ConcreteClassDemo(10,20);
        obj.display();
    }
}