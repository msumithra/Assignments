/*Write a program to print “Z” Traversal  elements present in an array?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                           Output :  1 3 4 3 9 2 10
*/

class day3_9
{
	public static void main(String[] args)
	{
		int[][] mat={{1,3,4},{6,3,2},{9,2,10}};
		int r=3;
		int c=3;
		String bag="";
		for(int i=0;i<r;i++)
		{
			bag+=mat[0][i]+" ";
		}
		int m=1;
		for(int j=r-2;j>=0;j--)
		{
		 	bag+=mat[m][j]+" ";
		 	m++;
		}
		for(int i=1;i<r;i++)
		{
			bag+=mat[r-1][i]+" ";
		}
		System.out.println(bag);
	}
}
