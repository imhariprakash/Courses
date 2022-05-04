import java.util.Scanner;
 
class KnapSack{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of items : ");
        int n = sc.nextInt();
        int[] quantity = getQuantity(n);
        float[] profit = getProfit(n, quantity);
        System.out.print("Enter the capacity of container : ");
        int capacity = sc.nextInt();
        quickSort(profit, quantity, 0, n-1);
        print(quantity);
        print(profit);

        float maxProfit = getMaxProfit(quantity, profit, capacity); 
        System.out.println("Maximum profit : " + maxProfit);

        sc.close();
    }

    public static float getMaxProfit(int[] quantity, float[] profit, int capacity){
        float maxProfit = 0.0f;
        int stock = 0, i = 0;
        while(i < quantity.length){
            if(stock + quantity[i] > capacity){
                maxProfit += (capacity - stock) * profit[i];
                return(maxProfit);
            }
            stock += quantity[i];
            maxProfit +=(profit[i] * quantity[i]);
            i++;
        }
        return(maxProfit);
    }

    public static int[] getQuantity(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static float[] getProfit(int n, int[] quantity){
        float[] arr = new float[n];
        for(int i = 0; i < n; i++){
            arr[i] = (sc.nextFloat())/quantity[i];
        }
        return arr;
    }

    public static void print(int[] array){
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void print(float[] array){
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }


    public static int partition(float[] profit, int[] quantity, int low, int high)
    {
     
        float pivot = profit[high];
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
            if (profit[j] > pivot)
            {
                i++;
                swap(profit, i, j);
                swap(quantity, i, j);
            }
        }
        swap(profit, i + 1, high);
        swap(quantity, i + 1, high);
        return (i + 1);
    }
     
    static void quickSort(float[] profit, int[] quantity, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(profit, quantity, low, high);
     
            quickSort(profit, quantity, low, pi - 1);
            quickSort(profit, quantity, pi + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(float[] arr, int i, int j){
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*abstract

2 3 5 7 1 4 1

10 5 15 7 6 18 3

*/