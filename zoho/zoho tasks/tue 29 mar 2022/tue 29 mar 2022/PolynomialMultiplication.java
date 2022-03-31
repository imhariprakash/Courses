import java.util.Scanner;
class PolynomialMultiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in equation 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter number of elements in equation 1 : ");
        int m = sc.nextInt();
        int[] a = new int[n];

        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m - 1];
        for(int i = 0; i < n + m - 1; i++){
            c[i] = 0;
            for(int j = 0; j < n; j++){
                if(i - j >= 0 && i - j < m){
                    c[i] += a[j] * b[i - j];
                }
            }
        }
        for(int i = 0; i < n + m - 1; i++){
            System.out.print(c[i]);
            if(i == 1){
                System.out.print("x");
            }
            else if(i != 0){
                System.out.print("x^" + i);
            }
            if(i != n + m - 2){
                System.out.print(" + ");
            }
        }
        sc.close();
    }
}
