class GenericArray<T> {
    private final T[] array;
    public GenericArray(T[] array){
        this.array = array.clone();
    }
    public T getElement(int index){
        return(array[index]);
    }

    public static void main(String[] args){
        var array = new GenericArray<>(new Integer[]{1,2,3,4});
        System.out.println(array.getElement(0));
    }
}