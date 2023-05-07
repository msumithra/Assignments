/*Write a program to the print the spiral Traversal diagonal element present in the 2d matrix;
            Input: arr[][] = {{1,2,3,4}
                                      {5,6,7,8}
                                       {9,10,11,12}
                                         {13,14,15,16}} 
             Output: 1 16 13 4 6 11 10 7
*/

class day8_4
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n=4;
		int t=0;  int b=n;  int l=0; int r=n;
		String store="";
		while(t<=b && l<=r)
		{
			for(int i=t;i<b;i++)
			{
				if(i==t || i==b-1)
				{
					store+=arr[i][i]+" ";
				}
			}
			int m=t;
			for(int i=r-1; i>=l; i--)
			{
				if(i==t || i==b-1)
				{
					store+=arr[i][m]+" ";
				}
				m++;
			}
		
		
		t++;
		b--;
		l++;
		r--;
		}
		System.out.println(store);
	}
}
