class two_dimensional_merge_sort{
    public static void main(String[] args){
        int[][] arr = {{1,4,11},{9,15,18},{13,20,23}};
        merge_sort(arr);
        print_2d_array(arr);
    }

    public static void print_2d_array(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void merge_sort(int[][] arr){
        if(arr.length==1){
            return;
        }
        int mid = arr.length/2;
        int[][] left = new int[mid][arr[0].length];
        int[][] right = new int[arr.length-mid][arr[0].length];
        for(int i=0;i<mid;i++){
            for(int j=0;j<arr[0].length;j++){
                left[i][j] = arr[i][j];
            }
        }
        for(int i=mid;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                right[i-mid][j] = arr[i][j];
            }
        }
        merge_sort(left);
        merge_sort(right);
        merge(left,right,arr);
    }

    public static void merge(int[][] left,int[][] right,int[][] arr){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i][0]<right[j][0]){
                arr[k][0] = left[i][0];
                i++;
            }
            else{
                arr[k][0] = right[j][0];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k][0] = left[i][0];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k][0] = right[j][0];
            j++;
            k++;
        }
    }
}