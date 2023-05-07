/*Write a program to print all the elements present in the matrix in “R” traversal.
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
                        Output: 1 4 7 2 3 6 5 9
*/

class day10_4
{
	public static void main(String[] args)
	{
		//int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] arr={{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}};
		int r=3;
		int c=3;
		int rm=r/2;
		int cm=c/2;
		
		String ans="";
		for(int i=0;i<r;i++)
		{
			ans+=arr[i][0]+" ";
		}
		
		for(int i=1;i<r;i++)
		{
			ans+=arr[0][i]+" ";
		}
		for(int i=1;i<=rm;i++)
		{
			ans+=arr[i][c-1]+" ";
		}
		for(int i=c-2;i>0;i--)
		{
			ans+=arr[rm][i]+" ";
		}
		
		for(int i=rm+1;i<r;i++)
		{
			ans+=arr[i][c-1]+" ";
		}
		System.out.println(ans);
	}
	
	
	
}
