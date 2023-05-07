/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 3 2 6 8
*/


class day12_5
{
	public static void main(String[] args)
	{
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		int r=3;
		int c=3;
		int rm=r/2;
		int cm=c/2;
		
		String ans="";
		for(int i=c-1;i>=cm;i-- )
		{
			ans+=mat[0][i]+" ";
		}
		
		int k=1;
		for(int i=cm+1;i<c;i++)
		{
			ans+=mat[k][i]+" ";
		}
		k++;
		
		int k1=rm+1;
		for(int i=c-2;i>=cm;i--)
		{
			ans+=mat[k1][i]+" ";
		}
		k1++;
		System.out.println(ans);
	}
}
