class TArray{
    public static void main(String args[]){
        int i,j,k,l=1;
        int array[][][]=new int [3][4][4];
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<4;k++){
                    array[i][j][k]=l;
                    l++;
                }
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<4;k++){
                    System.out.print(array[i][j][k] +"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}