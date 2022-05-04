import java.util.Scanner;
 
class myClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i - j + " ");
            }
            for(int j = 0; j < (2 * (n - 1) - 1) - 2 * i; j++){
                System.out.print("0 ");
            }
            for(int j = 1; j <= i; j++){
                if(i == n - 1 && j == 1){
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


/*

4
0 0 0 0 0 
1 0 0 0 1 
2 1 0 1 2 
3 2 1 2 3 


5
0 0 0 0 0 0 0 
1 0 0 0 0 0 1
2 1 0 0 0 1 2
3 2 1 0 1 2 3
4 3 2 1 2 3 4 


6
0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 1
2 1 0 0 0 0 0 1 2
3 2 1 0 0 0 1 2 3
4 3 2 1 0 1 2 3 4
5 4 3 2 1 2 3 4 5


7
0 0 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 1
2 1 0 0 0 0 0 0 0 1 2 
3 2 1 0 0 0 0 0 1 2 3
4 3 2 1 0 0 0 1 2 3 4
5 4 3 2 1 0 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6


*/