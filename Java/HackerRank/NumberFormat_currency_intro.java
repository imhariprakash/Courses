import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        //NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Locale INDIA = new Locale("en","IN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String currency = formatter.format(10340.2345);  //Rs. only comes in java8 - so be careful
        System.out.println(currency);
        scan.close();
    }
}
