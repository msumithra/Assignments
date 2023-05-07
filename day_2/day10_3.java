/*Two common ways of traversing a matrix are row-major-order and column-major-order. 
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output : Row-wise: 1 2 3 4 5 6 7 8 9
               Col-wise : 1 4 7 2 5 8 3 6 9
*/


class day10_3
{
	public static void main(String[] args)
	{
	
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int n=3;
		String ans1="";
		String ans2="";
		int b=0;
		while(b<n)
		{
		  
			for(int i=0;i<n;i++)
			{
			ans2+=arr[b][i]+" ";
			
			}
			b++;
		}
		System.out.println("Row-wise : "+ans2);
		int k=0;
		while(k<n)
		{
		  
			for(int i=0;i<n;i++)
			{
			ans1+=arr[i][k]+" ";
			
			}
			k++;
		}
		System.out.println("col-wise : "+ans1);
	}
}
