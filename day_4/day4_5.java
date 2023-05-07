/*Write a program to replace 0’s with 1’s and 1’s with 0’s in a 2D Array?
Example : input : [[1,1,0],[0,0,1],[1,0,1]]
                 Output : [[0,0,1],[1,1,1],[0,1,0]]
*/

class day4_5
{
	public static void main(String[] args)
	{
		int[][] mat={{1,1,0},{0,0,1},{1,0,1}};
		String res="";
		int n=3;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==1)
				{
					mat[i][j]=0;
				}
				else 
				{
					count++;
					mat[i][j]=1;
				}
			}
		}
		//System.out.println(mat);
		//System.out.println(count);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
