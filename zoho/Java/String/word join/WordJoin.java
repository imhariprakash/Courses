import java.util.Scanner;
class WordJoin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Max char per line : ");
        int max = sc.nextInt();
        System.out.print("Favourite character : ");
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        int[] length = new int[n];
        String[] array = new String[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.next();
        }
        getSize(array, length, n);
        sort(array, length, n);
        getAnswer(array, length, n, max, ch);
        sc.close();
    }

    public static void sort(String[] array, int[] length, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(isGreater(array[j], length[j], array[i], length[i])){
                    swap(array, i, j);
                    swap(length, i, j);
                }
            }
        }
    }

    public static boolean isGreater(String s1, int n1, String s2, int n2){
        if(n1 > n2){
            return true;
        }
        else if(n2 > n1){
            return false;
        }
        for(int i = 0; i < n1; i++){
            if(lower(s1.charAt(i)) < lower(s2.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static char lower(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return((char)(ch + 32));
        }
        return(ch);
    }
    public static char upper(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return((char)(ch - 32));
        }
        return(ch);
    }
    
    public static void swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void getSize(String[] array, int[] length, int n){
        for(int i = 0; i < n; i++){
            length[i] = getLength(array[i]);
        }
    }

    public static void getAnswer(String[] array, int[] length, int n, int max, char ch){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(length[i] == 0 || length[j] == 0){
                    continue;
                }
                int ans = (getCount(array[i], length[i], ch) + getCount(array[j], length[j], ch));
                if(ans <= max){
                    System.out.println(array[i] + " " + array[j] + " (" + ans + ")");
                    length[i] = 0;
                    length[j] = 0;
                    break;
                }
            }
        }
    }

    public static int getCount(String str, int n, char ch){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) && (str.charAt(i) != lower(ch)) && (str.charAt(i) != upper(ch))) 
                count++;
        }
        return count;
    }



    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return(count - 1);
        }
    }

    public static void printArray(String[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

// Zoho Eating Watching Pogo Loving Mango

/*

Max char per line : 15
Favourite character : w
10
Twinkle Twinkle little star how i wonder what you are
Twinkle Twinkle (12)
wonder little (11)
what star (7)
are you (6)
how i (3)


Max char per line : 10
Favourite character : o
6
Zoho Eating Watching Pogo Loving Mango
Watching Pogo (10)
Eating Mango (10)
Loving Zoho (7)
*/