class main{
	public static void main(String[] args){
	int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	int leftSum=0;
	int rightSum=0;
	for(int i=0;i<arr.length;i++)
	{
		leftSum+=arr[i][i];
	}
	int k=0;
	for(int j=arr.length-1;j>=0;j--)
	{
		rightSum+=arr[j][k];
		k++;
	}
	
	System.out.println(rightSum+leftSum);
	
	}
}