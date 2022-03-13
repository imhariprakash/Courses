import java.util.Scanner;
class pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = getLength(str);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n -1){
                    System.out.print(str.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
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

/*----------------------------------------------------------------

12345
1       5 
  2   4   
    3     
  2   4   
1       5 


geeksforgeeks
g                       s 
  e                   k   
    e               e     
      k           e       
        s       g
          f   r
            o
          f   r
        s       g
      k           e
    e               e
  e                   k
g                       s

*/