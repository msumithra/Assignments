/*Write a program to transpose a given 2D Array
Input : [1,2,3],[4,5,6],[7,8,9]]
Output : [[1,4,7],[2,5,8],[3,6,9]]
*/

class day5_6
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int n=3;
		String ans="";
		int k=0;
		while(k<n){
		for(int i=0;i<n;i++)
		{
			ans+=arr[i][k]+" ";
		}
		k++;
		}
		
		System.out.println(ans);
	}
}
