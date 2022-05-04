import java.util.Scanner;

class InnerClassStatic{
    public static int a = 10;

    public static class InnerClass{
        public static void getScore(){
            System.out.println("Score is " + a);
        }
    }
}

class InnerClassStaticDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InnerClassStatic.InnerClass.getScore();
        sc.close();
    }
}