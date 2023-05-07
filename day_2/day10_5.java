/*Write a program to print all the even indices  element at beginning and all odd indices element at the end present  in the matrix below traversal
Input : mat[][] = {{1, 2, 3,10}, 
                             {4, 5, 6,11}, 
                             {7, 8, 9,12},
                              {13,14,15,16}}
Output : 1  3 4 6 7 9 13 15 2 10 5 11 8 12 24 16
*/

class day10_5
{
	public static void main(String[] args)
	{
		int mat[][] = {{1, 2, 3,10}, 
                             {4, 5, 6,11}, 
                             {7, 8, 9,12},
                              {13,14,15,16}};
                int n=4;
                String ans="";
                int k=0;
                while(k<n)
                {
		        
			for(int i=0;i<n;i++)
			{
				if(i%2==0)
				{
					ans+=mat[k][i]+" ";	
				}
			}
			k++;
			
		}
		//System.out.println(ans);
		int k1=0;
		while(k1<n)
                {
		        
			for(int i=0;i<n;i++)
			{
				if(i%2==1)
				{
					ans+=mat[k1][i]+" ";	
				}
			}
			k1++;
			
		}
		System.out.println(ans);
	}
}
