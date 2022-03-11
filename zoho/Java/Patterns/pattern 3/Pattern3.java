import java.util.Scanner;

class Pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                System.out.print("   ");
            }
            if(i % 2 == 0){
                for(int j = (4 * i + 1); j <= 4*(i + 1); j++){
                    System.out.printf("%3d",j);
                }
            }
            else{
                for(int j = (4 * (i + 1)); j > (4 * i); j--){
                    System.out.printf("%3d",j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/*abstract

4
              1  2  3  4
           8  7  6  5
        9 10 11 12
    16 15 14 13

5
                 1  2  3  4
              8  7  6  5
           9 10 11 12
       16 15 14 13
    17 18 19 20

*/