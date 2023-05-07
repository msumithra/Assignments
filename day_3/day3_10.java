/*Write a program to print “N” Traversal  elements present in an array?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                          Output :  9 6 1 3 10 2 4
*/


class day3_10
{
	public static void main(String[] args)
	{
		int[][] mat={{1,3,4},{6,3,2},{9,2,10}};
		int r=3;
		int c=3;
		String bag="";
		
		for(int i=r-1;i>=0;i--)
		{
			bag+=mat[i][0]+" ";
		}
		
		for(int i=1;i<r;i++)
		{
			bag+=mat[i][i]+" ";
		}
		
		for(int i=r-1;i>=0;i--)
		{
			bag+=mat[i][r-1]+" ";
		}
		
		System.out.println(bag);
	}
}
