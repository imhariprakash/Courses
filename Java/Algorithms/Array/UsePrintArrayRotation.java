import java.util.Scanner;
class UsePrintArrayRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        getArray(array, n);
        System.out.print("How many rotations ? : ");
        int k = sc.nextInt();
        
        for(int i = n - k; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < n - k; i++){
            System.out.print(array[i] + " ");
        }

        sc.close();
    
    }
    public static void getArray(int[] array, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }
}