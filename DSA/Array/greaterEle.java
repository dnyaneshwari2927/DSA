class greater{
	public static void main(String[] args){
		int arr[]=new int[]{5,2,4,6,3,1,8,9,4,9,9,5};
		int n = 12;
		int count = 0;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}System.out.println(count);
	}
}
