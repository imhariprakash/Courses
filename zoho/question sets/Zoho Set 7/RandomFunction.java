import java.util.Random;
public class RandomFunction {
    public static void main(String[] args)
    {
        Random rand=new Random();
        int max=100;
        int randomnumber=rand.nextInt(max)+1;
        System.out.println(randomnumber);
    }
}
