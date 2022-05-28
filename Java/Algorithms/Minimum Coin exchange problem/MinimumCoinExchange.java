import java.util.Scanner;
 
class MinimumCoinExchange{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] coins = getArray();

        System.out.println("Minimum coins : " + minimumCoinExchange(coins));

        sc.close();
    }

    public static int minimumCoinExchange(int[] coins){
        System.out.print("Enter the total amount of money : ");
        int value = sc.nextInt();

        int count = 0;

        for(int i = 0; i < coins.length; i++){
            count += (value / coins[i]);
            value -= (coins[i] * (value / coins[i]));

            if(value == 0){
                break;
            }
        }

        return count;
    }

    public static int[] getArray(){
        System.out.print("Enter the number of coins : ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.print("Enter the coins : ");

        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }

        quickSort(coins, 0, n - 1);

        return coins;


    }

    public static void printArray(int[] array){
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static int partition(int[] arr, int low, int high)
    {
     
        int pivot = arr[high];
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] > pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
     
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
     
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


/*

Enter the number of coins : 4
Enter the coins : 5 10 20 25
Enter the total amount of money : 110
Minimum coins : 5

Enter the number of coins : 4
Enter the coins : 25 20 10 5
Enter the total amount of money : 50
Minimum coins : 2

Enter the number of coins : 4
Enter the coins : 20 25 5 10
Enter the total amount of money : 40              ------------------> wrong since the optimal solution is 2 25 rupee coin but greedy gives 3
Minimum coins : 3

*/