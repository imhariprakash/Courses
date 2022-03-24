import java.util.Scanner;

class Sample2{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //int n = 5;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            //int count = 0;
            for(int j =  0; j < n; j++){
                System.out.print(((j  + i) % n + 1) + " ");
                //count++;
            }
            

            System.out.println();
        }
    }
}