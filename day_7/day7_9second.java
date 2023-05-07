/*Write a program to find a common element present in three sorted arrays .
Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
*/

class day7_9
{
	public static void main(String[] args)
	{
		int ar1[] = {1, 5, 10, 20, 40, 80} ;
		int ar2[] = {1, 7, 20, 80, 100} ;
		int ar3[] = {1, 4, 15, 20, 30, 70, 80, 120} ;
		
		String ans="";
		String ans1="";
		for(int i=0;i<ar1.length;i++)
		{
			
			int freq=-1;
			for(int j=0;j<ar2.length;j++)
			{
			
				
				
				if(ar1[i]==ar2[j])
				{
					freq=ar1[i];
					ans+=ar1[i]+" ";
				}
				
			}
			for(int k=0;k<ar3.length;k++)
			{
			
				
				
				if(ar1[i]==ar3[k])
				{
					freq=ar1[i];
					ans1+=ar1[i]+" ";
				}
				
			}
			
			
		}
		
		if(ans.equals(ans1))
		{
			System.out.println(ans);
		}
	}
}
