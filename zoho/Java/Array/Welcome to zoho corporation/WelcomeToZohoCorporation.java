import java.util.Scanner;
 
class WelcomeToZohoCorporation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char [][] twodArray = getTwodArray(name);
        print(twodArray);
        System.out.print("Enter the word to be searched : ");
        String word = sc.nextLine();
        SearchLeftToRight(twodArray, word);
        SearchTopToBottom(twodArray, word);
        sc.close();
    }

    public static void SearchLeftToRight(char[][] twodArray, String word) {
        for(int i = 0; i < twodArray.length; i++){
            int startx = i, starty = 0, endx = i, endy = 0, count = 0;
            for(int j = 0; j < twodArray.length; j++){
                if(getUpperCase(twodArray[i][j]) != getUpperCase(word.charAt(count))){
                    count = 0;
                    starty = j + 1;
                }
                else{
                    endy = j;
                    count++;
                    if(count == word.length()){
                        print(startx, starty, endx, endy);
                        count = 0;
                    }
                }
            }
        }
    }

    public static void SearchTopToBottom(char[][] twodArray, String word) {
        for(int i = 0; i < twodArray.length; i++){
            int startx = i, starty = 0, endx = i, endy = 0, count = 0;
            for(int j = 0; j < twodArray.length; j++){
                if(getUpperCase(twodArray[j][i]) != getUpperCase(word.charAt(count))){
                    count = 0;
                    starty = j + 1;
                }
                else{
                    endy = j;
                    count++;
                    if(count == word.length()){
                        print(starty, startx, endy, endx);
                        count = 0;
                    }
                }
            }
        }
    }

    public static char[][] getTwodArray(String name){
        int count = 0;
        int num = (int)Math.ceil(Math.sqrt(name.length()));
        char[][] twodArray = new char[num][num];
        for(int i = 0; i < twodArray.length; i++){
            for(int j = 0; j < 5; j++) {
                if(count < name.length()) {
                    twodArray[i][j] = name.charAt(count++);
                }
            }
        }
        return twodArray;
    }

    public static void print(char[][] twodArray){
        for(int i = 0; i < twodArray.length; i++){
            for(int j = 0; j < twodArray.length; j++){
                System.out.print(twodArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int startx, int starty, int endx, int endy){
        System.out.println("Start index : <" + startx + ", " + starty + ">");
        System.out.println("End index : <" + endx + ", " + endy + ">");
    }

    public static char getUpperCase(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return (char)(ch - 32);
        }
        return ch;
    }
}