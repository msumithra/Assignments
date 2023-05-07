/*Write a program to print the array element in the pattern below(i.e swastika pattern)?
            Example : input  : Array = [[1,2,3],[4,5,6],[7,8,9]]
                 Output =  1 4 5 6 9 7 8 5 2 3
*/

class day4_6
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int r=3;
		int c=3;
		int rm=r/2;
		int cm=c/2;
		
		String bag="";
		for(int i=0;i<r-1;i++)
		{
		 	bag+=arr[i][0]+" ";
		}
		for(int i=1;i<r;i++)
		{
			bag+=arr[rm][i]+" ";
		}
		for(int i=rm+1;i<r;i++ )
		{
			bag+=arr[i][c-1]+" ";
		}
		
		for(int i=0;i<=rm;i++)
		{
			bag+=arr[r-1][i]+" ";
		}
		for(int i=r-2;i>=0;i--)
		{
			bag+=arr[i][cm]+" ";
		}
		for(int i=rm+1;i<c;i++)
		{
			bag+=arr[0][i]+" ";
		}
		System.out.println(bag);
	}
}
