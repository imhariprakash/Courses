import java.util.Scanner;

class Singleton{
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("Singleton constructor");
    } // avoid instantiation of Singleton class

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    } // return the same object each time
}
 
class SingletonDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton == singleton2);
        sc.close();
    }
}