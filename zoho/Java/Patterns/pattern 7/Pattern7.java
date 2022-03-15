import java.util.Scanner;
class Pattern7{
    public static int max = 5;
    public static int maxCount = max * max;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int turn = 0, count = 0; 
        if(row == max - 1){
            turn = 1;
        }

        for(int i = col; count < maxCount; i = (i + 1) % max){
            if(turn % 2 == 0){
                for(int j = max - 1; j >= 0; j--){
                    printNum(i, j, count);
                    count++;
                    turn = 1;
                }
            }
            else{
                for(int j = 0; j < max; j++){
                    printNum(i, j, count);
                    count++;
                    turn = 0;
                }
            }
        }
        sc.close();
    }

    public static void printNum(int i, int j, int count){
        if(i % 2 == 0){
            System.out.print((i * max) + j + 1);
        }
        else{
            System.out.print((i + 1) * max - j);
        }
        if(count != maxCount - 1){
            System.out.print(",");
        }
    }
}

/*----------------------------------------------------------------

4 0
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25

4 1
10,9,8,7,6,15,14,13,12,11,20,19,18,17,16,25,24,23,22,21,1,2,3,4,5

0 3
16,17,18,19,20,21,22,23,24,25,5,4,3,2,1,10,9,8,7,6,15,14,13,12,11

*/