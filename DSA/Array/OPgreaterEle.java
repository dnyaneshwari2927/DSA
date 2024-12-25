class op{
	public static void main(String[] args){
		int arr[] = new int[]{2,5,4,6,9,8,9,4,9,7};
		int n =10;
		int count = 0;
		int MaxEle = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++){
			if(arr[i]>MaxEle){
				
				MaxEle = arr[i];
			}
		
	}

			for(int i = 0;i<n;i++){
			if(arr[i]==MaxEle){
				count++;
			}
		}
		System.out.println(n-count);
	}
}
