import java.util.Scanner;
class Pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*

Input : n = 5
Output : 
    0
   101
  21012
 3210123
432101234

Input : n = 7
Output : 
      0
     101
    21012
   3210123
  432101234
 54321012345
6543210123456

Input:n = 4 
Output:
   0
  101
 21012
3210123

*/