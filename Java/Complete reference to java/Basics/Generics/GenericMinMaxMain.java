class GenericMinMax<T>{
    private T min, max;
    private T[] array;
    public GenericMinMax(T[] array){
        this.array = array.clone();
        min = 1000000000;
        max = -100000000;
    }

    public T min(){
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return(min);
    }

    public T max(){
        for(int i = 0; i < array.length; i++){
            if(array[i]){
                max = array[i];
            }
        }
        return(max);
    }

}

class GenericMinMaxMain{
    public static void main(String[] args) {
        GenericMinMax array = new GenericMinMax<>(new Integer[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(array.min() +" "+array.max());
        GenericMinMax array1 = new GenericMinMax<>(new Float[] {1.0,2.0,3.0,4.0,5.0,6.0,7.0});
        System.out.println(array1.min() +" "+array1.max());
    }
}