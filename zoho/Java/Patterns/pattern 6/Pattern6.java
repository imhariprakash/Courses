import java.util.Scanner;
class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(j % 2 != 0){
                    System.out.printf("%3d",((j * row) - i + 1));
                }
                else{
                    System.out.printf("%3d",(j - 1) * row + i);
                }
            }
            System.out.println();
        }
    }
}

/*


5 5
  5  6 15 16 25
  4  7 14 17 24
  3  8 13 18 23
  2  9 12 19 22
  1 10 11 20 21

6 6
  6  7 18 19 30 31
  5  8 17 20 29 32
  4  9 16 21 28 33
  3 10 15 22 27 34
  2 11 14 23 26 35
  1 12 13 24 25 36


  */