import java.util.Scanner;
class IntermittentFasting1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int[] size = getCount(str);
        int[] array = new int[size[1]];
        extractSetArray(str, array, size);
        fasting(array, size[1]);
        sc.close();
    }

    public static void fasting(int[] array, int n){
        for(int i = 0; i < n; i = i + 2){
            if(!((array[i + 1] - array[i] > 3) && (array[i + 1] - array[i] < 9))){
                System.out.println("no");
                return;
            }
            if(i + 2 < n){
                if(!(array[i + 2] - array[i + 1] > 16)){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }

    public static void printArray(int[] array, int n){
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void extractSetArray(String str, int[] array, int[] size){
        int start = 1, j = 0, i, end;
        for(i = 0; i < size[0]; i++){
            if(str.charAt(i) == ',' || str.charAt(i) == ']'){
                end = i - 1;
                array[j++] = getNumber(str, start, end);
                start = i + 1;
            }
        }
    }

    public static int getNumber(String str, int start, int end){
        int num = 0;
        for(int i = start; i <= end; i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num * 10 + (int)(str.charAt(i) - 48);
            }
        }
        return num;
    }

    public static int[] getCount(String str){
        int[] size = {0, 1};
        try{
            while(true){
                str.charAt(size[0]);
                if(str.charAt(size[0]++) == ','){
                    size[1]++;
                }
            }
        }catch(Exception e){
            return size;
        }
    }

   
}

/*----------------------------------------------------------------

[0,4,21,26,43,49]
yes

[0,3,21,26,43,49]
no

[0,4,21,26,43,49,66,77]
no

[0,4,20,26,43,49]
no

[0,6,30,36,45,51]
no

[0,6,30,36,55,61]
yes

*/