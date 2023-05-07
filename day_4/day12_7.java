/*Write a program for 90 degrees  rotation of  all elements present in a 2d array in anti-clockwise direction in place?
Example : Input 1 : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                     Output1 :  [[10 ,2, 4],[2,3,3],[9,6,1]]  
*/

class day12_7
{
	public static void main(String[] args)
	{
		int[][] mat={{1,3,4},{6,3,2},{9,2,10}};
		int n=3;
		String ans="";
		 int m=2;
		while(n>m && m>=0)
		{
			for(int i=n-1;i>=0;i--)
			{
				ans+=mat[i][m]+" ";
			}
			m--;
		}
		
		System.out.println(ans);
	}
}
