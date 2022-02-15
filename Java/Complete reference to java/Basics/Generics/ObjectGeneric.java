class GenericType{
    private Object var1;
    private Object var2;
    private Object var3;

    public GenericType(Object var1, Object var2, Object var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public Object get1(){
        return(var1);
    }

    public Object get2(){
        return(var2);
    }

    public Object get3(){
        return(var3);
    }
}

class ObjectGeneric{
    public static void main(String[] args) {
        Integer var1 = 1232;
        Float var2 = 123.2627f;
        Double var3 = 9878.878d;
        GenericType myVar = new GenericType(var1, var2, var3);
        System.out.println(myVar.get1());
        System.out.println(myVar.get2());
        System.out.println(myVar.get3());
    }
}