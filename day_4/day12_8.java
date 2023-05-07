/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 2 6 8 4
*/

class day12_8
{
	public static void main(String[] args)
	{
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		int r=3;
		int c=3;
		int rm=r/2;
		int cm=c/2;
		
		String ans="";
		int k=0;
		for(int i=cm;i<c;i++)
		{
			ans+=mat[k][i]+" ";
			k++;
		}
		
		
		int k1=rm+1;
		for(int i=c-2;i>=cm;i--)
		{
			ans+=mat[k1][i]+" ";
		}
		k1++;
		
		int k2=r-2;
		for(int i=cm-1;i>=0;i--)
		{
			ans+=mat[k2][i]+" ";
			k--;
		}
		int k3=rm-1;
		for(int i=1;i<=cm;i++)
		{
			ans+=mat[k3][i]+" ";
			k3--;
		}
		
		System.out.println(ans);
	}
}
