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
        
        sort(array1, 2 * n);
        sort(array2, 2 * m);

        n = removeRepitation(array1, n);
        m = removeRepitation(array2, m);

        process(array1, 2 * n, array2, 2 * m);

    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int removeRepitation(int[] array, int n){
        for(int i = 0; i < (2 * n - 2); i = i + 2){
            for(int j = i + 2; j < 2 * n; j = j + 2){
                if(array[i + 1] != array[j + 1]){
                    break;
                }
                if(array[i + 1] == array[j + 1]){
                    array[i] = array[i] + array[j];
                    leftShift(array, 2 * n, j);
                    n--;
                    j = j - 2;
                }
            }
        }
        return n;
    }

    public static void leftShift(int[] array, int n, int start){
        for(int i = start; i < n - 2; i = i + 2){
            array[i] = array[i + 2];
            array[i + 1] = array[i + 2 + 1];
        }
    }

    public static void sort(int[] array, int n){
        for(int i = 0; i < n - 2; i = i + 2){
            for(int j = i + 2; j < n; j = j + 2){
                if(array[i + 1] < array[j + 1]){
                    swap(array, i, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp1 = array[i];
        int temp2 = array[i + 1];
        array[i] = array[j];
        array[i + 1] = array[j + 1];
        array[j] = temp1;
        array[j + 1] = temp2;
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
        if(y == 0){
            System.out.print(" + " + x);
            return;
        }
        if(y == 1){
            System.out.print(" + " + x + "x");
            return;
        }
        System.out.print(" + " + x + "x^" + y);
    }

    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
    }
}