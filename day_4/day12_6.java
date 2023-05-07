/*Write a program to print the array element in the pattern below?
            Example : input  : String str = “JCEP”
*/

class day12_6
{
	public static void main(String[] args)
	{
		int[][] mat={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int r=5;
		int c=5;
		int cm=c/2;
		int rm=r/2;
		
		String ans="";
		//*********************** J
		
		for(int i=0;i<r;i++)
		{
			ans+=mat[0][i]+" ";
		}
		for(int i=1;i<r;i++)
		{
			ans+=mat[i][cm]+" ";
		}
		for(int i=rm-1;i>=0;i--)
		{
			ans+=mat[r-1][i]+" ";
		}
		
		//************************ C
		
		for(int i=c-1;i>0;i--)
		{
			ans+=mat[0][i]+" ";
		}
		for(int i=1;i<r-1;i++)
		{
			ans+=mat[i][0]+" ";
		}
		for(int i=1;i<c;i++)
		{
			ans+=mat[r-1][i]+" ";
		}
		
		// ************************ E
		
		for(int i=c-1;i>=0;i--)
		{
			ans+=mat[0][i]+" ";
		}
		for(int i=1;i<r;i++)
		{
			ans+=mat[i][0]+" ";
		}
		for(int i=1;i<c;i++)
		{
			ans+=mat[r-1][i]+" ";
		}
		for(int i=1;i<c;i++)
		{
			ans+=mat[rm][i]+" ";
		}
		
		//************************ P
		
		for(int i=0;i<c;i++)
		{
			ans+=mat[rm][i]+" ";
		}
		
		for(int i=rm+1;i>=0;i--)
		{
			ans+=mat[i][c-1]+" ";
		}
		for(int i=c-2;i>=0;i--)
		{
			ans+=mat[0][i]+" ";
		}
		for(int i=1;i<r;i++)
		{
			ans+=mat[i][0]+" ";
		}
		
		System.out.println(ans);
	}
}
