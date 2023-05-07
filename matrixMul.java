class matrixMul
{
	public static void main(String[] args) 
	{
		int[][] arr = {{3,3,3},{3,3,3},{3,3,3}};
		int rows = arr.length;
		int cols = arr[0].length;

		System.out.println(multiplyingWithArray(rows,cols,arr));
	
	}
	
	//multiplying the array elements
	public static int multiplyingWithArray(int rows, int cols,int[][] array) 
	{
		int productSum=1;
		
		for(int i = 0; i < rows ; i++)
		{
			for(int j=0 ;j < cols ; j++)
			{
			 	productSum *= array[i][j];
			}
		}
		return productSum;
	}
}
