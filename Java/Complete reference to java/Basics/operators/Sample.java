class Sample{
    public static void main(String[] args){
        int i = 10;
        int n = i++ % 2;
        int m = ++i % 7;
        System.out.println(i+" "+n+" "+m);
    }
}