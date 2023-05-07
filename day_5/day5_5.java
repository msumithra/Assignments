/*Write a program to print all the element in a string in the form “C” pattern in a 2D array
Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
Output : 1 2 3 4 7 8 9
*/

class day5_5
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int n=3;
		String ans="";
		for(int i=0;i<n;i++)
		{
			ans+=arr[0][i]+" ";
		}
		for(int i=1;i<n;i++)
		{
			ans+=arr[i][0]+" ";
		}
		for(int i=1;i<n;i++)
		{
			ans+=arr[n-1][i]+" ";
		}
		System.out.println(ans);
		
	}
}
