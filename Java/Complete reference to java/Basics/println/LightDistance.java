import java.util.*;

class LightDistance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long speed = 186000;
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        speed = (days * 24 * 60 * 60) * speed;
        System.out.println("Light travels "+speed+" miles in "+days+" days.");
        sc.close();
    }
}