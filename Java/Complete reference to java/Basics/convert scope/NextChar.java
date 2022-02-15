import java.util.*;

class NextChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char alpha = sc.next().charAt(0);
        if((alpha >= 'a' && alpha < 'z') || (alpha >= 'A' && alpha < 'Z')) {
            System.out.println((char)(alpha + 1));
        }
        else if(alpha == 'z' || alpha == 'Z'){
            System.out.println((char)(alpha - 25));
        }
        else{
            System.out.println(alpha);
        }
        sc.close();
    }
}