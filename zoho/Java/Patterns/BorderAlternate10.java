import java.util.Scanner;

class BorderAlternate10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int siz = 2 * n - 1;
        int start = 0, end = siz - 1, num;
        int[][] array = new int[siz][siz];
        for(int i = 0; i < n; start++, end--, i++){
            if(i % 2 == 0){
                num = 1;
            }
            else{
                num = 0;
            }

            for(int j = start; j <= end; j++){
                array[j][start] = num;
            }
            for(int j = start + 1; j <= end; j++){
                array[end][j] = num;
            }
            for(int j = end - 1; j >= start; j--){
                array[j][end] = num;
            }
            for(int j = end - 1; j >= start; j--){
                array[start][j] = num;
            }
        }

        printArray(array, siz);
    }

    public static void printArray(int[][] array, int siz){
        for(int i = 0; i < siz; i++){
            for(int j = 0; j < siz; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

/*

3
11111
10001
10101
10001
11111


5
111111111
100000001
101111101
101000101
101010101
101000101
101111101
100000001
111111111

*/