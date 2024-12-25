class reverse{
	public static void main(String[] args){
		int arr[] = new int[]{2,1,6,5,9};
		int n = 5;
		int i =0;
		int j = n-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}for(int k =0;k<n;k++){
			System.out.println(arr[k]);
		}
	}
}
