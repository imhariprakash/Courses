import java.util.Scanner;
class Name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = getLength(str);
        for(int i = 0; i < n; i++){
            for(int j = 0; j + i < n; j++){
                printString(str, j, j + i);
            }
        }
        sc.close();
    }

    public static void printString(String str, int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return count - 1;
        }   
    }
}