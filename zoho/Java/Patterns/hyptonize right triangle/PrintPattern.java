import java.util.Scanner;

class PrintPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xstart = 0, ystart = 0, xend = n -1, yend = n -1, count = 1;
        int space = getSpace(n);
        int array[][] = new int[n][n];

        for(int i = 0; i < ((n / 3) + 1); i++){
            for(int j = xstart, k = ystart; j <= xend; j++){
                array[j][k++] = count++; 
            }

            for(int j = xend - 1; j >= xstart; j--, count++){
                array[j][yend] = count;
            }

            for(int j = yend - 1; j > ystart; j--, count++){
                array[xstart][j] = count;
            }
            //next Iteration
            xstart++;
            ystart = ystart + 2;
            xend = xend - 2;
            yend--;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(array[i][j] == 0){
                    for(int k = 0; k <= space; k++)
                        System.out.print(" ");
                }
                else{
                    String format = "%" + Integer.toString(space + 1) + "d";
                    System.out.printf(format,array[i][j]);
                }
            }
            System.out.println();
        }

        sc.close();
    }

    public static int getSpace(int n){
        int num = 0, count = 0;
        for(int i = 1; i <= n; i++){
            num += i;
        }
        while(num != 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}


/*

7
  1 18 17 16 15 14 13
     2 19 27 26 25 12
        3 20 28 24 11
           4 21 23 10
              5 22  9
                 6  8
                    7



3
 1 6 5
   2 4
     3

method - zigzag - not a square so 4 index tracking - xstart, ystart, xend and yend

                    
*/