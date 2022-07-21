import java.util.Scanner;

public class rotatedSearch {


    static int rotated_search(int[] array,int key) {
        //Logic
        int start = 0; //start
        int end = array.length - 1; //last index of array

        while(start <= end){
            int mid = (start+end)/2;

            if(array[mid] == key){
                return mid;
            }

            //2 cases
            if(array[start] <= array[mid]){ 
                //left
                if(key>=array[start] && key<=array[mid]){
                    end = mid - 1;
                }
			else{
                    start = mid + 1;
                }

            }
            else{
                //right

                if(key>=array[mid] && key<=array[end]){
                    start = mid + 1;
                }
			else{
                    end = mid - 1;
                }

            }

        }
        return -1;

    }


    public static void main(String[] args) {



        int[] a = new int[]{4,5,6,7,0,1,2,3};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println( rotated_search(a,key) );
        scanner.close();
    }

}