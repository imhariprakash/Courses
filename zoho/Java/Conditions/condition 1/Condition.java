import java.util.Scanner;

class Condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int z = start; z <= end; z++){
            int x = addDigit(z);
            int y = reverse(x);
            if(x * y == z){
                System.out.println(z);
            }
        }
        sc.close();
    }

    public static int addDigit(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}

/*abstract

1 100
1
81

1000 2000
1458
1729

*/
