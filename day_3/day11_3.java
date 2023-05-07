/*Write a program to print the below name patterns (Swapna)
           Example : String str1 : “DJ”    String str2 : “JTBB”
*/

class day11_3
{
	public static void main(String[] args)
	{
		int[][] mat={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int r=5;
		int c=5;
		int rm=r/2;
		int cm=c/2;
		
		String ans="";
		String ans1="";
		//********************************* D
		for(int i=0;i<r;i++)
		{
			ans+=mat[i][0]+" ";
		}
		for(int i=1;i<r-1;i++)
		{
			ans+=mat[0][i]+" ";
		}
		for(int i=1;i<r-1;i++)
		{
			ans+=mat[i][c-1]+" ";
		}
		for(int i=r-2;i>0;i--)
		{
			ans+=mat[r-1][i]+" ";
		}
		//*********************************** J
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
		//System.out.println(ans);
		String dj=ans;
		
		//************************************ J
		for(int i=0;i<r;i++)
		{
			ans1+=mat[0][i]+" ";
		}
		for(int i=1;i<r;i++)
		{
			ans1+=mat[i][cm]+" ";
		}
		for(int i=rm-1;i>=0;i--)
		{
			ans1+=mat[r-1][i]+" ";
		}
		//System.out.println(ans1);
		//************************************ T
		
		for(int i=0;i<r;i++)
		{
			ans1+=mat[0][i]+" ";
		}
		for(int i=1;i<r;i++)
		{
			ans1+=mat[i][cm]+" ";
		}
		
		//************************************  B
		
		for(int i=0;i<r;i++)
		{
			ans1+=mat[i][0]+" ";
		}
		
		for(int i=1;i<c-1;i++)
		{
			ans1+=mat[0][i]+" ";
		}
		
		for(int i=1;i<rm;i++)
		{
			ans1+=mat[i][c-1]+" ";
		}
		for(int i=c-2;i>0;i--)
		{
			ans1+=mat[rm][i]+" ";
		}
		for(int i=rm+1;i<r-1;i++)
		{
			ans1+=mat[i][c-1]+" ";
		}
		for(int i=c-2;i>0;i--)
		{
			ans1+=mat[r-1][i]+" ";
		}
		
		
		//************************************  B
		
		for(int i=0;i<r;i++)
		{
			ans1+=mat[i][0]+" ";
		}
		
		for(int i=1;i<c-1;i++)
		{
			ans1+=mat[0][i]+" ";
		}
		
		for(int i=1;i<rm;i++)
		{
			ans1+=mat[i][c-1]+" ";
		}
		for(int i=c-2;i>0;i--)
		{
			ans1+=mat[rm][i]+" ";
		}
		for(int i=rm+1;i<r-1;i++)
		{
			ans1+=mat[i][c-1]+" ";
		}
		for(int i=c-2;i>0;i--)
		{
			ans1+=mat[r-1][i]+" ";
		}
		String jtbb=ans1;
		System.out.println(dj);
		System.out.println("***********************");
		System.out.println(jtbb);
		
		
	}
}
