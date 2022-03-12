import java.util.Scanner;
class PolynomialAdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[2 * n];
        getArray(array1, 2 * n);
        int m = sc.nextInt();
        int[] array2 = new int[2 * m];
        getArray(array2, 2 * m);
        
        process(array1, 2 * n, array2, 2 * m);
    }

    public static void process(int[] array1, int n, int[] array2, int m){
        int i = 0, j = 0;

        if(array1[i + 1] > array2[j + 1]){
            System.out.print(array1[i] + "x^" + array1[i + 1]);
            i = i + 2;
        }
        else if(array1[i + 1] < array2[j + 1]){
            System.out.print(array2[j] + "x^" + array2[j + 1]);
            j = j + 2;
        }
        else if(array1[i + 1] == array2[j + 1]){
            System.out.print((array1[i] + array2[j]) + "x^" + array1[i + 1]);
            i = i + 2;
            j = j + 2;
        }

        for(; i < n && j < m; ){
            if(array1[i + 1] > array2[j + 1]){
                print(array1[i], array1[i + 1]);
                i = i + 2;
            }
            else if(array1[i + 1] < array2[j + 1]){
                print(array2[j], array2[j + 1]);
                j = j + 2;
            }
            else if(array1[i + 1] == array2[j + 1]){
                print(array1[i] + array2[j], array1[i + 1]);
                i = i + 2;
                j = j + 2;
            }
        }

        for(; i < n; i = i + 2){
            print(array1[i], array1[i + 1]);
        }

        for(; j < m; j = j + 2){
            print(array2[j], array2[j + 1]);
        }
    }

    public static void print(int x, int y){
        System.out.print(" + " + x + "x^" + y);
    }

    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
    }
}