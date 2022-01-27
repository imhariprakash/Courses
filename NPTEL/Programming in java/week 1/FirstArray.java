class FirstArray{
	public static void main(String args[]){
		int array[]={1,2,3,4,5},sum=0;
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
			sum+=i;
		}
		System.out.println();
		System.out.println("Average: "+(float)sum/array.length);
	}
}
