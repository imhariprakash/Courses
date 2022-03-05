import java.util.Scanner;

class Border01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 2 * n - 1; i++){
            for(int j = 0; j < 2 * n -1; j++){
                if((j >= i && j <= (2 * n - 2 - i)) || (j >= (2 * n - i - 2) && j <= (2 * n - 2 - (2 * n - i - 2)))){
                    System.out.print((i + 1) % 2);
                }
                else if((i >= j && i <= (2 * n -2 - j)) || i >= (2 * n - 2 - j) && i <= (2 * n - 2 - (2 * n - j - 2))){
                    System.out.print((j + 1) % 2);
                }
                else{
                    System.out.print(i % 2);
                }
            }
            System.out.println();
        }
    }
}


/*abstract

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


find which outer square - outer n th square - 1
                          outer n - 1 square - 0
                          
5 means 0 to 8

for 0,0 

j >= 0 and j <= 8  - satisfied
i >= 0 and i <= 8

for 0,5

j >= 0 and j <= 8  - satisfied

*/
