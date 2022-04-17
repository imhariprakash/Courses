import java.io.*;
 
class AppendToFile{
    public static void main(String[] args){
        try{
            PrintWriter file = new PrintWriter(new FileWriter("hello.txt", true));
            file.println("Hello World");
            file.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}