class GenericType<T, U, W>{
    private T var1;
    private U var2;
    private W var3;

    public GenericType(T var1, U var2, W var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T get1(){
        return(var1);
    }

    public U get2(){
        return(var2);
    }

    public W get3(){
        return(var3);
    }
}

class Main{
    public static void main(String[] args) {
        GenericType <Integer, Float, Double> myVar = new GenericType <Integer, Float, Double> (11,11.98f,111.767d);
        System.out.println(myVar.get1());
        System.out.println(myVar.get2());
        System.out.println(myVar.get3());
    }
}