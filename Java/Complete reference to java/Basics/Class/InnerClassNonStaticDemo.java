class InnerClassNonStatic{
    public static int a = 10;

    public  class InnerClass{
        public void getScore(){
            System.out.println("Score is " + a);
        }
        public static void getStaticScore(){
            System.out.println("Score is " + a);
        }
    }
}

class InnerClassNonStaticDemo{
    public static void main(String[] args){
        InnerClassNonStatic.InnerClass obj = new InnerClassNonStatic().new InnerClass();
        InnerClassNonStatic.InnerClass.getStaticScore();
        obj.getScore();
    }
}