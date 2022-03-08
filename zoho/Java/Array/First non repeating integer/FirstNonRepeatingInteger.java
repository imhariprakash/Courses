import java.util.Scanner;

class FirstNonRepeatingInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {0,0,0,0,0,0,0,0,0,0};

        getCount(array, n);

        int num = checkRepeat(array);
        System.out.println(num);
    }

    public static void getCount(int[] array, int n){
        while(n > 0){
            array[n % 10]++;
            n = n / 10;
        }
    }

    public static int checkRepeat(int[] array){
        for(int i = 0; i < 10; i++){
            if (array[i] == 1){
                return(i);
            }
        } 
        return -1;  
    }

}

/*

12332
1

1210201307
3

1231231230
0

*/