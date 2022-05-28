import java.util.Scanner;
 
class FibonacciDynamicApproach{
    private static int[] array;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        array = new int[n + 1];
        initializeArray(array);
        // array[0] = 0;
        // array[1] = 1;

        System.out.println("Ans : " + fibonacci(n));
    }

    // public static int fibonacci(int n){
    //     if(n == 0) return 0;
    //     if(n == 1) return 1;

    //     int a, b;

    //     if(array[n - 1] == 0){
    //         array[n - 1] = fibonacci(n - 1);
    //     }

    //     if(array[n - 2] == 0){
    //         array[n - 2] = fibonacci(n - 2);
    //     }

    //     a = array[n - 1];
    //     b = array[n - 2];

    //     return (a + b);
    // }

    // other method 

    public static int fibonacci(int n){
        if(array[n] == -1){
            if(n == 0) return 0;
            if(n == 1) return 1;
            array[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return array[n];
    }

    public static void initializeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = -1;
        }
    }
}


/*

// bottom up approach

public static int fibonacci(int n){
    int[] array = new int[n + 1];
    array[0] = 0;
    array[1] = 1;

    for(int i = 2; i <= n; i++){
        array[i] = array[i - 1] + array[i - 2];
    }

    return array[n];
}

*/