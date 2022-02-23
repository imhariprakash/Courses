import java.util.Scanner;
class FindKValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];
        getArray(array);
        findK(array);
        
    }

    public static void findK(int[] array){
        int a = 0, b = array.length - 1, mid;
        while(a < b){
            mid = (a + b) / 2;
            if(array[mid] == 0){
                a = mid + 1;
            }
            else if(array[mid] == 1){
                b = mid;
            }
        }
        System.out.println(a);
    }

    public static void getArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter element " + (i + 1) + " : " + array[i]);
        }
    }
}