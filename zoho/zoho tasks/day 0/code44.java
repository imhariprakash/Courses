public class code44 {
    public static void main(String[] args){
        int[] arr = {1,9,7,56,36,91,42};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    if (min == -1) {
                        min = arr[j];
                    } else {
                        min = min > arr[j] ? arr[j] : min;
                    }
                }
            }
            arr[i] = min;
        }
        for(int i =0; i < 7; i++)
            System.out.print(arr[i] + " "); 
    }
}